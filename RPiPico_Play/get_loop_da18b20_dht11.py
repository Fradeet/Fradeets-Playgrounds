import dht
import onewire, ds18x20
import machine
from machine import Pin,ADC,UART
import utime
import time
import gc

#Init
# create the onewire object

#Use different 1Wire
ds = ds18x20.DS18X20(onewire.OneWire(Pin(26,Pin.IN,Pin.PULL_UP)))
ds1 = ds18x20.DS18X20(onewire.OneWire(Pin(22,Pin.IN,Pin.PULL_UP)))
dhtPin = machine.Pin(27)
gpsPin = UART(1, baudrate=9600, tx=Pin(4), rx=Pin(5))
boardLED = Pin(25, Pin.OUT)
button = Pin(26,Pin.IN,Pin.PULL_UP)
gc.enable()
lastGetTempTime = time.time()
f = open('data.csv', 'w')
#Time, Temp
f.write("time,DHT11 Temp,Analog Temp,Fast Mode\n")
f.close()
#Init End

def GPSModule():
    global
    #TODO:GPS data get
    
    #TODO Remove 'b'and ''
    
    #TODO Converet list
    
    #TODO "if command..."
def SwitchOnBoardLED():
    if(boardLED.value() == 1):
        boardLED.off()
    else:
        boardLED.on()

def GetDHT():
    dTemp = dht.DHT11(dhtPin)
    dTemp.measure()
    #print("DHT11: "+ str(dTemp.temperature()))
    return dTemp.temperature()
    #sleep(3)

def GetDS18(ds):
    # scan for devices on the bus
    roms = ds.scan()
    #time.sleep(3)
    #print('found devices:', roms)
    #print('temperatures:', end=' ')
    ds.convert_temp()
    time.sleep_ms(750)
    ##i=0
    #for rom in roms:
        #print(rom)
        #roms[i] = ds.read_temp(rom)
        #i += 1
    return ds.read_temp(roms[0])

def GetPicoTemp():
    sensor_temp = ADC(4)
    conversion_factor = 3.3 / (65535)
    reading = sensor_temp.read_u16() * conversion_factor 
    temperature = 27 - (reading - 0.706)/0.001721
    ##print("Pico: " + str("{:.1f}".format(temperature)))
    return "{:.1f}".format(temperature)
    #utime.sleep(2)
def WriteFile(dhtTemp,picoTemp,dsTemp,dsTemp2):
    global lastGetTempTime
    f = open('data.csv', 'a')
    #Time, Temp
    f.write(str(time.time()-lastGetTempTime)+","+str(dhtTemp)+","+str(picoTemp)+","+str(dsTemp)+","+str(dsTemp2)+"\n")
    f.close()

def main():
    #a = 0
    while(1):
        #try get sensor data, if it's work
        try:
            dhtTemp = GetDHT()
        except:
            dhtTemp = 0
        try:
            dsTemp = GetDS18(ds)
        except:
            dsTemp = 0
        try:
            dsTemp2 = GetDS18(ds1)
        except:
            dsTemp2 = 0
        picoTemp = GetPicoTemp()
        WriteFile(dhtTemp,picoTemp,dsTemp,dsTemp2)
        time.sleep(1)
        SwitchOnBoardLED()
        print(dhtTemp,dsTemp,dsTemp2,picoTemp)
        #a +=1

if __name__ == "__main__":
    main()