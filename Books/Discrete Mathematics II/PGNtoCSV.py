from converter.pgn_data import PGNData
import pandas as pd

list = []
for i in range(261):
    if i == 0:
        continue
    list.append("C:/Users/Emre/OneDrive - Akdeniz Üniversitesi/Masaüstü/Sonuçlar/"+str(i)+".pgn")

pgn_data = PGNData(list,"output")
df = pgn_data.export()
print(df)
df.to_csv(r'C:/Users/Emre/OneDrive - Akdeniz Üniversitesi/Masaüstü/sonuc_dosyasi.csv')
