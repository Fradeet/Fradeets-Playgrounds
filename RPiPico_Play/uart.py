from machine import UART,Pin
import time
uartPin = UART(0, 115200,tx=Pin(0), rx=Pin(1))
uartPin.init(115200, bits=8, parity=None, stop=1,timeout=2000) # init with given parameters

uartPin.write('AT+CWLAP\r\n')
#time.sleep()
print(uartPin.read())
while(True):
    break