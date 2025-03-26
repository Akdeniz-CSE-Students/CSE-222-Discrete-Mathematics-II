import pyautogui as pg
import time as t

pg.click(1118, 1065) #GOOGLE BUTONU
t.sleep(1)
counter = 0
game_count = 1

while counter < 10000:
    
    pg.click(70,190) #START BUTONU
    t.sleep(120)
    pg.click(350, 580) #Export PGN butonu
    t.sleep(1)
    pg.click(200, 310) #Masaüstü butonu
    t.sleep(1)
    pg.click(300, 400) #Sonuçlar Filesi
    pg.click(300, 400) #Sonuçlar Filesi
    t.sleep(1)
    pg.click(830,910) #TextBar
    pg.click(830,910) #TextBar
    t.sleep(1)
    pg.typewrite(str(game_count))
    t.sleep(1)
    pg.click(830,980) #Kaydet
    pg.click(1600,500)

    t.sleep(1)
    counter += 1
    game_count += 1
