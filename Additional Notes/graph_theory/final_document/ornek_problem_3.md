# Örnek Problem 3: Ağaçlar ve Minimum Kapsayan Ağaçlar

## Problem 3.1: Ağaç Özellikleri

**Problem:** Aşağıdaki grafın bir ağaç olup olmadığını belirleyiniz. Eğer ağaç ise, kökünü 'a' düğümü olarak kabul ederek:
1. Her düğümün derinliğini bulunuz.
2. Her düğümün yüksekliğini bulunuz.
3. Tüm yaprakları listeleyiniz.
4. Preorder, inorder ve postorder dolaşımlarını yazınız.

Graf G aşağıdaki gibidir:
- Düğümler: a, b, c, d, e, f, g, h
- Kenarlar: (a,b), (a,c), (b,d), (b,e), (c,f), (c,g), (e,h)

**Çözüm:**

Bir grafın ağaç olması için, bağlantılı ve döngüsüz olması gerekir. Alternatif olarak, n düğümlü bir graf, bağlantılı ve tam olarak (n-1) kenara sahipse bir ağaçtır.

Verilen grafta 8 düğüm ve 7 kenar var. Kenar sayısı (n-1) = 8-1 = 7'ye eşit. Grafın bağlantılı olduğunu da görebiliriz, çünkü her düğüm 'a' düğümünden erişilebilir. Dolayısıyla, bu graf bir ağaçtır.

1. Her düğümün derinliği (kökten düğüme olan yolun uzunluğu):
   - derinlik(a) = 0 (kök)
   - derinlik(b) = 1 (a'dan b'ye bir kenar)
   - derinlik(c) = 1 (a'dan c'ye bir kenar)
   - derinlik(d) = 2 (a'dan b'ye, b'den d'ye)
   - derinlik(e) = 2 (a'dan b'ye, b'den e'ye)
   - derinlik(f) = 2 (a'dan c'ye, c'den f'ye)
   - derinlik(g) = 2 (a'dan c'ye, c'den g'ye)
   - derinlik(h) = 3 (a'dan b'ye, b'den e'ye, e'den h'ye)

2. Her düğümün yüksekliği (düğümden bir yaprağa olan en uzun yolun uzunluğu):
   - yükseklik(a) = 3 (a'dan b'ye, b'den e'ye, e'den h'ye)
   - yükseklik(b) = 2 (b'den e'ye, e'den h'ye)
   - yükseklik(c) = 1 (c'den f'ye veya c'den g'ye)
   - yükseklik(d) = 0 (yaprak)
   - yükseklik(e) = 1 (e'den h'ye)
   - yükseklik(f) = 0 (yaprak)
   - yükseklik(g) = 0 (yaprak)
   - yükseklik(h) = 0 (yaprak)

3. Yapraklar (derecesi 1 olan düğümler, yani çocuğu olmayan düğümler):
   - d, f, g, h

4. Dolaşımlar:
   - Preorder dolaşım (kök, sol, sağ): a, b, d, e, h, c, f, g
   - Inorder dolaşım (sol, kök, sağ): d, b, e, h, a, f, c, g
   - Postorder dolaşım (sol, sağ, kök): d, h, e, b, f, g, c, a

Not: İkili ağaç olmadığı için, inorder dolaşım tam olarak tanımlı değildir. Ancak, düğümleri sol ve sağ olarak gruplandırarak bir inorder dolaşım elde edebiliriz.

## Problem 3.2: Minimum Kapsayan Ağaç

**Problem:** Aşağıdaki ağırlıklı graf için:
1. Kruskal algoritmasını kullanarak minimum kapsayan ağacı bulunuz.
2. Prim algoritmasını kullanarak minimum kapsayan ağacı bulunuz.
3. Minimum kapsayan ağacın toplam ağırlığını hesaplayınız.

Graf G aşağıdaki gibidir:
- Düğümler: A, B, C, D, E, F
- Kenarlar ve ağırlıkları: (A,B,6), (A,C,1), (A,D,5), (B,C,5), (B,E,3), (C,D,5), (C,E,6), (C,F,4), (D,F,2), (E,F,6)

**Çözüm:**

1. Kruskal algoritması:
   - Kenarları ağırlıklarına göre artan sırada sırala:
     (A,C,1), (D,F,2), (B,E,3), (C,F,4), (A,D,5), (B,C,5), (C,D,5), (A,B,6), (C,E,6), (E,F,6)
   
   - Sırayla kenarları ekle, döngü oluşturmadıkça:
     1. (A,C,1) ekle: {(A,C)}
     2. (D,F,2) ekle: {(A,C), (D,F)}
     3. (B,E,3) ekle: {(A,C), (D,F), (B,E)}
     4. (C,F,4) ekle: {(A,C), (D,F), (B,E), (C,F)}
     5. (A,D,5) ekle: {(A,C), (D,F), (B,E), (C,F), (A,D)}
     
     Bu noktada, 5 kenar ekledik ve 6 düğüm var. Bir ağaçta, kenar sayısı düğüm sayısından bir eksik olmalıdır, yani 5 kenar yeterlidir. Ancak, şu anda grafımız bağlantılı değil, çünkü {A,C,D,F} ve {B,E} olmak üzere iki bağlantılı bileşen var.
     
     6. (B,C,5) ekle: {(A,C), (D,F), (B,E), (C,F), (A,D), (B,C)}
     
     Şimdi grafımız bağlantılı ve bir ağaç oluşturdu.

2. Prim algoritması:
   - A düğümünden başlayalım:
     - A'nın komşuları: B(6), C(1), D(5)
     - En küçük ağırlıklı kenar: (A,C,1)
     - Ağaca ekle: {(A,C)}
   
   - Ağaçtaki düğümler: A, C
     - A'nın kalan komşuları: B(6), D(5)
     - C'nin komşuları: B(5), D(5), E(6), F(4)
     - En küçük ağırlıklı kenar: (C,F,4)
     - Ağaca ekle: {(A,C), (C,F)}
   
   - Ağaçtaki düğümler: A, C, F
     - A'nın kalan komşuları: B(6), D(5)
     - C'nin kalan komşuları: B(5), D(5), E(6)
     - F'nin komşuları: D(2), E(6)
     - En küçük ağırlıklı kenar: (F,D,2)
     - Ağaca ekle: {(A,C), (C,F), (F,D)}
   
   - Ağaçtaki düğümler: A, C, F, D
     - A'nın kalan komşuları: B(6)
     - C'nin kalan komşuları: B(5), E(6)
     - F'nin kalan komşuları: E(6)
     - D'nin komşuları: A(5), C(5)
     - En küçük ağırlıklı kenar: (C,B,5)
     - Ağaca ekle: {(A,C), (C,F), (F,D), (C,B)}
   
   - Ağaçtaki düğümler: A, C, F, D, B
     - B'nin komşuları: A(6), E(3)
     - En küçük ağırlıklı kenar: (B,E,3)
     - Ağaca ekle: {(A,C), (C,F), (F,D), (C,B), (B,E)}
   
   - Ağaçtaki düğümler: A, C, F, D, B, E
     - Tüm düğümler ağaca eklendi, algoritma tamamlandı.

3. Minimum kapsayan ağacın toplam ağırlığı:
   - Kruskal algoritması ile bulunan kenarlar: (A,C,1), (D,F,2), (B,E,3), (C,F,4), (B,C,5)
   - Toplam ağırlık: 1 + 2 + 3 + 4 + 5 = 15
   
   - Prim algoritması ile bulunan kenarlar: (A,C,1), (C,F,4), (F,D,2), (C,B,5), (B,E,3)
   - Toplam ağırlık: 1 + 4 + 2 + 5 + 3 = 15
   
   Her iki algoritma da aynı toplam ağırlığa sahip minimum kapsayan ağaçlar buldu, ancak kenar seçimleri farklı olabilir. Bu, minimum kapsayan ağacın benzersiz olmayabileceğini gösterir.

## Problem 3.3: Ağaç Sayısı ve Prüfer Kodu

**Problem:** 
1. 6 düğümlü etiketli bir ağacın kaç farklı şekilde oluşturulabileceğini hesaplayınız.
2. Aşağıdaki Prüfer koduna sahip ağacı çiziniz: [3, 1, 3, 5]
3. Aşağıdaki ağacın Prüfer kodunu bulunuz:
   - Düğümler: 1, 2, 3, 4, 5, 6
   - Kenarlar: (1,2), (1,3), (3,4), (3,5), (5,6)

**Çözüm:**

1. Cayley formülüne göre, n etiketli düğüme sahip farklı ağaç sayısı n^(n-2)'dir.
   
   6 düğümlü etiketli bir ağaç için, farklı ağaç sayısı:
   6^(6-2) = 6^4 = 1296
   
   Dolayısıyla, 6 düğümlü etiketli bir ağaç 1296 farklı şekilde oluşturulabilir.

2. Prüfer kodu [3, 1, 3, 5] olan ağacı çizelim. Prüfer kodu, n-2 uzunluğunda bir dizidir, bu nedenle ağacımız 6 düğüme sahip olacaktır.
   
   Prüfer kodundan ağacı oluşturmak için:
   - Başlangıçta tüm düğümleri içeren bir küme oluştur: {1, 2, 3, 4, 5, 6}
   - Prüfer kodundaki her eleman için, kodda olmayan en küçük düğümü bul ve bu iki düğüm arasında bir kenar oluştur.
   - Kodda olmayan düğümü kümeden çıkar.
   - Son iki düğüm arasında da bir kenar oluştur.
   
   Adım adım:
   - Prüfer kodu: [3, 1, 3, 5]
   - Düğümler: {1, 2, 3, 4, 5, 6}
   
   1. Kodun ilk elemanı 3, kodda olmayan en küçük düğüm 2.
      - Kenar ekle: (2,3)
      - 2'yi kümeden çıkar: {1, 3, 4, 5, 6}
   
   2. Kodun ikinci elemanı 1, kodda olmayan en küçük düğüm 4.
      - Kenar ekle: (4,1)
      - 4'ü kümeden çıkar: {1, 3, 5, 6}
   
   3. Kodun üçüncü elemanı 3, kodda olmayan en küçük düğüm 6.
      - Kenar ekle: (6,3)
      - 6'yı kümeden çıkar: {1, 3, 5}
   
   4. Kodun dördüncü elemanı 5, kodda olmayan en küçük düğüm 1.
      - Kenar ekle: (1,5)
      - 1'i kümeden çıkar: {3, 5}
   
   5. Kalan iki düğüm arasında bir kenar oluştur: (3,5)
   
   Sonuç olarak, ağacın kenarları: (2,3), (4,1), (6,3), (1,5), (3,5)

3. Verilen ağacın Prüfer kodunu bulalım:
   - Düğümler: 1, 2, 3, 4, 5, 6
   - Kenarlar: (1,2), (1,3), (3,4), (3,5), (5,6)
   
   Prüfer kodunu bulmak için:
   - Her adımda, derecesi 1 olan en küçük etiketli düğümü bul.
   - Bu düğümün komşusunu Prüfer koduna ekle.
   - Bu düğümü ve ona bağlı kenarı graftan çıkar.
   - Sadece iki düğüm kalana kadar devam et.
   
   Adım adım:
   1. Düğümlerin dereceleri: d(1)=2, d(2)=1, d(3)=3, d(4)=1, d(5)=2, d(6)=1
      - Derecesi 1 olan en küçük düğüm: 2
      - 2'nin komşusu: 1
      - Prüfer kodu: [1]
      - 2'yi ve (1,2) kenarını çıkar.
   
   2. Düğümlerin dereceleri: d(1)=1, d(3)=3, d(4)=1, d(5)=2, d(6)=1
      - Derecesi 1 olan en küçük düğüm: 1
      - 1'in komşusu: 3
      - Prüfer kodu: [1, 3]
      - 1'i ve (1,3) kenarını çıkar.
   
   3. Düğümlerin dereceleri: d(3)=2, d(4)=1, d(5)=2, d(6)=1
      - Derecesi 1 olan en küçük düğüm: 4
      - 4'ün komşusu: 3
      - Prüfer kodu: [1, 3, 3]
      - 4'ü ve (3,4) kenarını çıkar.
   
   4. Düğümlerin dereceleri: d(3)=1, d(5)=2, d(6)=1
      - Derecesi 1 olan en küçük düğüm: 3
      - 3'ün komşusu: 5
      - Prüfer kodu: [1, 3, 3, 5]
      - 3'ü ve (3,5) kenarını çıkar.
   
   5. Geriye sadece 5 ve 6 düğümleri kaldı, algoritma tamamlandı.
   
   Sonuç olarak, ağacın Prüfer kodu: [1, 3, 3, 5]
