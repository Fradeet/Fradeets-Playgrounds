import dht
import machine
from time import sleep

def PicoDht():
    d = dht.DHT11(machine.Pin(2))
    while True:
        d.measure()
        print(str(d.temperature())+ ' ' + str(d.humidity()))
        sleep(3)
        
if __name__ == "__main__":
    PicoDht()
