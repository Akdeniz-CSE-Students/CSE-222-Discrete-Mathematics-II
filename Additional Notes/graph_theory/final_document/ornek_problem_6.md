# Örnek Problem 6: Renklendirme Problemleri

## Problem 6.1: Düğüm Renklendirme

**Problem:** Aşağıdaki graf için:
1. Açgözlü renklendirme algoritmasını kullanarak düğümleri renklendirin.
2. Grafın kromatik sayısını belirleyin.
3. Optimal bir renklendirme bulun.

Graf G:
- Düğümler: a, b, c, d, e, f
- Kenarlar: (a,b), (a,c), (a,d), (b,c), (b,e), (c,d), (c,f), (d,e), (d,f), (e,f)

**Çözüm:**

1. Açgözlü renklendirme algoritması, düğümleri belirli bir sırayla işler ve her düğüme, komşularının renklerini dikkate alarak mümkün olan en küçük renk numarasını atar. Düğümleri alfabetik sırayla işleyelim:

   - a: Renk 1 (henüz hiçbir komşusu renklendirilmedi)
   - b: Renk 2 (a'nın komşusu ve a Renk 1)
   - c: Renk 3 (a ve b'nin komşusu, a Renk 1, b Renk 2)
   - d: Renk 2 (a ve c'nin komşusu, a Renk 1, c Renk 3)
   - e: Renk 1 (b ve d'nin komşusu, b Renk 2, d Renk 2)
   - f: Renk 1 (c ve d'nin komşusu, c Renk 3, d Renk 2)

   Açgözlü renklendirme sonucu:
   - a: Renk 1
   - b: Renk 2
   - c: Renk 3
   - d: Renk 2
   - e: Renk 1
   - f: Renk 1

   Bu renklendirme 3 renk kullanır.

2. Grafın kromatik sayısını belirlemek için, grafın yapısını analiz edelim. Grafdaki a, b, c düğümleri bir üçgen (tam alt graf K₃) oluşturur, bu nedenle kromatik sayı en az 3 olmalıdır. Ayrıca, yukarıda 3 renkle bir renklendirme bulduk, bu nedenle kromatik sayı en fazla 3'tür. Dolayısıyla, grafın kromatik sayısı χ(G) = 3'tür.

3. Optimal bir renklendirme, minimum sayıda renk kullanan bir renklendirmedir. Kromatik sayı 3 olduğundan, 3 renkle bir renklendirme optimal olacaktır. Yukarıda bulduğumuz renklendirme zaten optimaldir:
   - Renk 1: a, e, f
   - Renk 2: b, d
   - Renk 3: c

   Alternatif bir optimal renklendirme:
   - Renk 1: a, f
   - Renk 2: b, d
   - Renk 3: c, e

## Problem 6.2: Kenar Renklendirme

**Problem:** Aşağıdaki graf için:
1. Kenar kromatik sayısını belirleyin.
2. Optimal bir kenar renklendirmesi bulun.

Graf H:
- Düğümler: 1, 2, 3, 4, 5
- Kenarlar: (1,2), (1,3), (1,4), (2,3), (2,5), (3,4), (3,5), (4,5)

**Çözüm:**

1. Bir grafın kenar kromatik sayısı χ'(G), Δ(G) ≤ χ'(G) ≤ Δ(G) + 1 sınırları içindedir (Vizing teoremi). Burada Δ(G) grafın maksimum derecesidir.

   Graf H'deki düğümlerin dereceleri:
   - d(1) = 3
   - d(2) = 3
   - d(3) = 4
   - d(4) = 3
   - d(5) = 3

   Maksimum derece Δ(H) = 4'tür. Dolayısıyla, 4 ≤ χ'(H) ≤ 5.

   Grafın yapısını incelediğimizde, 3 düğümünün 4 komşusu vardır ve bu 4 kenarın hepsi farklı renkler almalıdır. Bu nedenle, kenar kromatik sayısı en az 4 olmalıdır. Ayrıca, aşağıda 4 renkle bir kenar renklendirmesi bulacağız, bu da kenar kromatik sayısının en fazla 4 olduğunu gösterir. Dolayısıyla, χ'(H) = 4'tür.

2. Optimal bir kenar renklendirmesi için, her düğümün tüm kenarlarının farklı renklerle renklendirilmesi gerektiğini unutmayın. 4 renk kullanarak bir kenar renklendirmesi bulalım:

   - (1,2): Renk 1
   - (1,3): Renk 2
   - (1,4): Renk 3
   - (2,3): Renk 3
   - (2,5): Renk 2
   - (3,4): Renk 1
   - (3,5): Renk 4
   - (4,5): Renk 2

   Bu renklendirmeyi doğrulayalım:
   - 1 düğümü: (1,2) Renk 1, (1,3) Renk 2, (1,4) Renk 3 - Tüm kenarlar farklı renkler.
   - 2 düğümü: (1,2) Renk 1, (2,3) Renk 3, (2,5) Renk 2 - Tüm kenarlar farklı renkler.
   - 3 düğümü: (1,3) Renk 2, (2,3) Renk 3, (3,4) Renk 1, (3,5) Renk 4 - Tüm kenarlar farklı renkler.
   - 4 düğümü: (1,4) Renk 3, (3,4) Renk 1, (4,5) Renk 2 - Tüm kenarlar farklı renkler.
   - 5 düğümü: (2,5) Renk 2, (3,5) Renk 4, (4,5) Renk 2 - Burada bir çelişki var, (2,5) ve (4,5) aynı rengi alamaz.

   Renklendirmeyi düzeltelim:
   - (4,5): Renk 4 (Renk 2 yerine)

   Düzeltilmiş renklendirme:
   - Renk 1: (1,2), (3,4)
   - Renk 2: (1,3), (2,5)
   - Renk 3: (1,4), (2,3)
   - Renk 4: (3,5), (4,5)

   Bu, 4 renkle geçerli bir kenar renklendirmesidir ve optimaldir.

## Problem 6.3: Harita Renklendirme

**Problem:** Aşağıdaki harita için, komşu bölgelerin farklı renklerle boyanması gerektiğinde, minimum renk sayısını bulunuz ve bir renklendirme örneği veriniz.

Harita:
- Bölgeler: A, B, C, D, E, F
- Komşuluklar: A-B, A-C, A-D, B-C, B-E, C-D, C-F, D-E, D-F, E-F

**Çözüm:**

Harita renklendirme problemi, bir düğüm renklendirme problemi olarak modellenebilir. Her bölge bir düğüm olarak temsil edilir ve komşu bölgeler arasında bir kenar çizilir. Oluşan graf, Problem 6.1'deki G grafı ile aynıdır.

Problem 6.1'de gösterdiğimiz gibi, bu grafın kromatik sayısı 3'tür. Dolayısıyla, haritayı boyamak için gereken minimum renk sayısı 3'tür.

Optimal bir renklendirme:
- Renk 1 (Kırmızı): A, E, F
- Renk 2 (Mavi): B, D
- Renk 3 (Yeşil): C

Bu renklendirmede, hiçbir komşu bölge aynı rengi almaz, bu da geçerli bir harita renklendirmesidir.

Dört Renk Teoremi'ne göre, herhangi bir düzlemsel harita en fazla dört renkle renklendirilebilir. Bu harita için üç renk yeterlidir, çünkü grafın kromatik sayısı 3'tür.
