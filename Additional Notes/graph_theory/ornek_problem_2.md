# Örnek Problem 2: Bağlantılılık ve Yollar

## Problem 2.1: Bağlantılı Bileşenler

**Problem:** Aşağıdaki graf için:
1. Bağlantılı bileşenleri bulunuz.
2. Her bileşenin düğüm ve kenar sayısını belirtiniz.
3. Grafı bağlantılı hale getirmek için en az kaç kenar eklenmelidir?

Graf G aşağıdaki gibidir:
- Düğümler: a, b, c, d, e, f, g, h, i, j
- Kenarlar: (a,b), (a,c), (b,c), (d,e), (d,f), (e,g), (f,g), (h,i), (i,j), (h,j)

**Çözüm:**

1. Bağlantılı bileşenleri bulmak için, grafı keşfetmemiz gerekiyor. DFS veya BFS kullanabiliriz.

   Bileşen 1'i bulmak için a'dan başlayalım:
   - a'yı ziyaret et
   - a'nın komşuları: b, c
   - b'yi ziyaret et
   - b'nin komşuları: a, c (a zaten ziyaret edildi)
   - c'yi ziyaret et
   - c'nin komşuları: a, b (ikisi de ziyaret edildi)
   
   Bileşen 1: {a, b, c}

   Bileşen 2'yi bulmak için henüz ziyaret edilmemiş bir düğümden (d) başlayalım:
   - d'yi ziyaret et
   - d'nin komşuları: e, f
   - e'yi ziyaret et
   - e'nin komşuları: d, g
   - g'yi ziyaret et
   - g'nin komşuları: e, f (e zaten ziyaret edildi)
   - f'yi ziyaret et
   - f'nin komşuları: d, g (ikisi de ziyaret edildi)
   
   Bileşen 2: {d, e, f, g}

   Bileşen 3'ü bulmak için henüz ziyaret edilmemiş bir düğümden (h) başlayalım:
   - h'yi ziyaret et
   - h'nin komşuları: i, j
   - i'yi ziyaret et
   - i'nin komşuları: h, j (h zaten ziyaret edildi)
   - j'yi ziyaret et
   - j'nin komşuları: h, i (ikisi de ziyaret edildi)
   
   Bileşen 3: {h, i, j}

   Dolayısıyla, grafın 3 bağlantılı bileşeni vardır: {a, b, c}, {d, e, f, g}, ve {h, i, j}.

2. Her bileşenin düğüm ve kenar sayısı:
   - Bileşen 1: 3 düğüm (a, b, c), 3 kenar ((a,b), (a,c), (b,c))
   - Bileşen 2: 4 düğüm (d, e, f, g), 4 kenar ((d,e), (d,f), (e,g), (f,g))
   - Bileşen 3: 3 düğüm (h, i, j), 3 kenar ((h,i), (i,j), (h,j))

3. Grafı bağlantılı hale getirmek için, bileşenleri birbirine bağlamamız gerekiyor. n bileşenli bir grafı bağlantılı hale getirmek için en az (n-1) kenar gereklidir. Bu grafta 3 bileşen olduğundan, en az 2 kenar eklemeliyiz.

   Örneğin, şu kenarları ekleyebiliriz:
   - (c,d): Bileşen 1'i Bileşen 2'ye bağlar
   - (g,h): Bileşen 2'yi Bileşen 3'e bağlar

   Bu iki kenar, grafı bağlantılı hale getirecektir.

## Problem 2.2: En Kısa Yol Problemi

**Problem:** Aşağıdaki ağırlıklı graf için, a düğümünden diğer tüm düğümlere olan en kısa yolları Dijkstra algoritmasını kullanarak bulunuz.

Graf G aşağıdaki gibidir:
- Düğümler: a, b, c, d, e, f
- Kenarlar ve ağırlıkları: (a,b,4), (a,c,2), (b,c,1), (b,d,5), (c,d,8), (c,e,10), (d,e,2), (d,f,6), (e,f,3)

**Çözüm:**

Dijkstra algoritmasını kullanarak a düğümünden diğer tüm düğümlere olan en kısa yolları bulalım:

1. Başlangıç durumu:
   - d(a) = 0 (başlangıç düğümü)
   - d(b) = ∞, d(c) = ∞, d(d) = ∞, d(e) = ∞, d(f) = ∞
   - S = {} (ziyaret edilen düğümler kümesi)

2. a'yı S'ye ekle ve komşularını güncelle:
   - S = {a}
   - d(b) = d(a) + w(a,b) = 0 + 4 = 4
   - d(c) = d(a) + w(a,c) = 0 + 2 = 2
   - d(d) = ∞, d(e) = ∞, d(f) = ∞

3. S'ye eklenmemiş düğümler arasından en küçük mesafeye sahip olanı seç: c (d(c) = 2)
   - S = {a, c}
   - d(b) = min(d(b), d(c) + w(c,b)) = min(4, 2 + 1) = 3
   - d(d) = min(d(d), d(c) + w(c,d)) = min(∞, 2 + 8) = 10
   - d(e) = min(d(e), d(c) + w(c,e)) = min(∞, 2 + 10) = 12
   - d(f) = ∞

4. S'ye eklenmemiş düğümler arasından en küçük mesafeye sahip olanı seç: b (d(b) = 3)
   - S = {a, c, b}
   - d(d) = min(d(d), d(b) + w(b,d)) = min(10, 3 + 5) = 8
   - d(e) = 12, d(f) = ∞

5. S'ye eklenmemiş düğümler arasından en küçük mesafeye sahip olanı seç: d (d(d) = 8)
   - S = {a, c, b, d}
   - d(e) = min(d(e), d(d) + w(d,e)) = min(12, 8 + 2) = 10
   - d(f) = min(d(f), d(d) + w(d,f)) = min(∞, 8 + 6) = 14

6. S'ye eklenmemiş düğümler arasından en küçük mesafeye sahip olanı seç: e (d(e) = 10)
   - S = {a, c, b, d, e}
   - d(f) = min(d(f), d(e) + w(e,f)) = min(14, 10 + 3) = 13

7. Son düğümü de ekleyelim: f (d(f) = 13)
   - S = {a, c, b, d, e, f}

Sonuç olarak, a düğümünden diğer düğümlere olan en kısa yollar:
- a → b: 3 (a → c → b)
- a → c: 2 (a → c)
- a → d: 8 (a → c → b → d)
- a → e: 10 (a → c → b → d → e)
- a → f: 13 (a → c → b → d → e → f)

## Problem 2.3: Köprüler ve Eklem Noktaları

**Problem:** Aşağıdaki graf için:
1. Tüm köprüleri bulunuz.
2. Tüm eklem noktalarını bulunuz.
3. Grafın çift bağlantılı bileşenlerini bulunuz.

Graf G aşağıdaki gibidir:
- Düğümler: 1, 2, 3, 4, 5, 6, 7, 8
- Kenarlar: (1,2), (1,3), (2,3), (2,4), (3,4), (4,5), (5,6), (5,7), (6,7), (7,8)

**Çözüm:**

1. Köprüleri bulmak için, her kenarı tek tek çıkarıp grafın bağlantılı bileşen sayısının artıp artmadığını kontrol edebiliriz. Daha verimli bir yöntem, DFS ağacını kullanarak köprüleri bulmaktır.

   Grafı incelediğimizde, (4,5) ve (7,8) kenarlarının köprü olduğunu görebiliriz. Çünkü:
   - (4,5) kenarını çıkarırsak, graf iki bağlantılı bileşene ayrılır: {1, 2, 3, 4} ve {5, 6, 7, 8}
   - (7,8) kenarını çıkarırsak, 8 düğümü izole olur ve graf iki bağlantılı bileşene ayrılır: {1, 2, 3, 4, 5, 6, 7} ve {8}

   Diğer kenarlar köprü değildir, çünkü her biri bir döngünün parçasıdır ve çıkarıldıklarında grafın bağlantılılığı bozulmaz.

2. Eklem noktalarını bulmak için, her düğümü tek tek çıkarıp grafın bağlantılı bileşen sayısının artıp artmadığını kontrol edebiliriz. Daha verimli bir yöntem, DFS ağacını kullanarak eklem noktalarını bulmaktır.

   Grafı incelediğimizde, 4, 5 ve 7 düğümlerinin eklem noktası olduğunu görebiliriz. Çünkü:
   - 4 düğümünü çıkarırsak, graf iki bağlantılı bileşene ayrılır: {1, 2, 3} ve {5, 6, 7, 8}
   - 5 düğümünü çıkarırsak, graf iki bağlantılı bileşene ayrılır: {1, 2, 3, 4} ve {6, 7, 8}
   - 7 düğümünü çıkarırsak, graf iki bağlantılı bileşene ayrılır: {1, 2, 3, 4, 5, 6} ve {8}

   Diğer düğümler eklem noktası değildir, çünkü çıkarıldıklarında grafın bağlantılı bileşen sayısı artmaz.

3. Çift bağlantılı bileşenler, herhangi bir düğümün çıkarılmasıyla bağlantısız hale gelmeyen maksimal alt graflardır. Başka bir deyişle, çift bağlantılı bir bileşende, herhangi iki düğüm arasında en az iki farklı yol vardır.

   Grafın çift bağlantılı bileşenleri:
   - {1, 2, 3, 4} (1-2-3-4-1 döngüsü)
   - {5, 6, 7} (5-6-7-5 döngüsü)
   - {4, 5} (tek kenar)
   - {7, 8} (tek kenar)

   Not: Tek bir kenar da bir çift bağlantılı bileşen olarak kabul edilir, ancak bu bileşen "gerçek" bir çift bağlantılı bileşen değildir, çünkü kenarın çıkarılması bileşeni bağlantısız hale getirir.
