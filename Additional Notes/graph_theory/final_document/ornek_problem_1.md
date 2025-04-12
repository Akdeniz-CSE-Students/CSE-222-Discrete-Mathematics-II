# Örnek Problem 1: Temel Kavramlar ve Graf Türleri

## Problem 1.1: Graf Temsili ve Özellikleri

**Problem:** Aşağıdaki graf G için:
1. Düğüm kümesini (V) ve kenar kümesini (E) yazınız.
2. Her düğümün derecesini bulunuz.
3. Komşuluk matrisini oluşturunuz.
4. İlişki matrisini oluşturunuz.
5. Bu graf hangi özel graf türlerine aittir? (Tam graf, iki parçalı graf, düzenli graf vb.)

Graf G aşağıdaki gibidir:
- Düğümler: v₁, v₂, v₃, v₄, v₅
- Kenarlar: (v₁,v₂), (v₁,v₃), (v₂,v₃), (v₂,v₄), (v₃,v₄), (v₃,v₅), (v₄,v₅)

**Çözüm:**

1. Düğüm kümesi ve kenar kümesi:
   - V(G) = {v₁, v₂, v₃, v₄, v₅}
   - E(G) = {(v₁,v₂), (v₁,v₃), (v₂,v₃), (v₂,v₄), (v₃,v₄), (v₃,v₅), (v₄,v₅)}

2. Her düğümün derecesi:
   - d(v₁) = 2 (v₁ düğümü v₂ ve v₃ düğümlerine bağlıdır)
   - d(v₂) = 3 (v₂ düğümü v₁, v₃ ve v₄ düğümlerine bağlıdır)
   - d(v₃) = 4 (v₃ düğümü v₁, v₂, v₄ ve v₅ düğümlerine bağlıdır)
   - d(v₄) = 3 (v₄ düğümü v₂, v₃ ve v₅ düğümlerine bağlıdır)
   - d(v₅) = 2 (v₅ düğümü v₃ ve v₄ düğümlerine bağlıdır)

   Dereceler toplamı = 2 + 3 + 4 + 3 + 2 = 14 = 2|E| = 2×7 = 14 (doğrulama)

3. Komşuluk matrisi:
   ```
     | v₁ v₂ v₃ v₄ v₅
   ---|---------------
   v₁ | 0  1  1  0  0
   v₂ | 1  0  1  1  0
   v₃ | 1  1  0  1  1
   v₄ | 0  1  1  0  1
   v₅ | 0  0  1  1  0
   ```

4. İlişki matrisi (kenarları e₁, e₂, ..., e₇ olarak etiketlersek):
   ```
     | e₁ e₂ e₃ e₄ e₅ e₆ e₇
   ---|-------------------
   v₁ | 1  1  0  0  0  0  0
   v₂ | 1  0  1  1  0  0  0
   v₃ | 0  1  1  0  1  1  0
   v₄ | 0  0  0  1  1  0  1
   v₅ | 0  0  0  0  0  1  1
   ```
   Burada:
   - e₁ = (v₁,v₂)
   - e₂ = (v₁,v₃)
   - e₃ = (v₂,v₃)
   - e₄ = (v₂,v₄)
   - e₅ = (v₃,v₄)
   - e₆ = (v₃,v₅)
   - e₇ = (v₄,v₅)

5. Graf türleri:
   - Bu graf tam graf değildir, çünkü tüm düğüm çiftleri arasında kenar yoktur (örneğin v₁ ve v₄ arasında kenar yoktur).
   - Bu graf düzenli graf değildir, çünkü tüm düğümlerin derecesi aynı değildir.
   - Bu graf iki parçalı graf değildir, çünkü v₂, v₃ ve v₄ arasında bir üçgen (döngü) vardır ve iki parçalı graflarda tek uzunlukta döngü olamaz.
   - Bu graf bağlantılıdır, çünkü herhangi iki düğüm arasında bir yol vardır.
   - Bu graf düzlemseldir, çünkü kenarları kesişmeden bir düzlemde çizilebilir.

## Problem 1.2: İki Parçalı Graf Testi

**Problem:** Aşağıdaki grafın iki parçalı olup olmadığını belirleyiniz ve eğer iki parçalıysa, düğümleri iki kümeye ayırınız.

Graf G aşağıdaki gibidir:
- Düğümler: a, b, c, d, e, f
- Kenarlar: (a,b), (a,d), (b,c), (b,e), (c,f), (d,e), (e,f)

**Çözüm:**

Bir grafın iki parçalı olması için, düğümlerini iki kümeye ayırabilmeliyiz, öyle ki aynı kümedeki düğümler arasında kenar olmasın. Başka bir deyişle, bir grafın iki parçalı olması için ve yalnızca bu durumda, tek uzunlukta döngüsü olmamalıdır.

Bu problemi çözmek için, grafı iki renkle (diyelim ki siyah ve beyaz) renklendirmeye çalışacağız. Eğer başarılı olursak, graf iki parçalıdır.

1. a düğümünü siyah olarak işaretleyelim.
2. a'nın komşuları b ve d'yi beyaz olarak işaretlemeliyiz.
3. b'nin komşuları a, c ve e'dir. a zaten siyah, bu yüzden c ve e'yi siyah olarak işaretlemeliyiz.
4. d'nin komşuları a ve e'dir. a zaten siyah, e ise az önce siyah olarak işaretlendi. Bu bir çelişkidir, çünkü d ve e aynı renkte olamaz (d beyaz, e siyah olmalı).

Bu çelişki, grafın iki parçalı olmadığını gösterir. Başka bir yöntem olarak, grafdaki döngüleri kontrol edebiliriz. Grafdaki a-b-e-d-a döngüsü 4 uzunluğundadır (çift), ancak b-c-f-e-b döngüsü 4 uzunluğundadır (çift). Tek uzunlukta bir döngü bulamadık, bu da grafın iki parçalı olabileceğini gösterir.

Daha sistematik bir yaklaşım için, BFS kullanarak düğümleri iki kümeye ayırmaya çalışalım:

1. a düğümünü 1. kümeye (siyah) koyalım.
2. a'nın komşuları b ve d'yi 2. kümeye (beyaz) koyalım.
3. b'nin komşuları a, c ve e'dir. a zaten 1. kümede, c ve e'yi 1. kümeye koyalım.
4. d'nin komşuları a ve e'dir. a zaten 1. kümede, e de 1. kümede. Bu bir çelişkidir.

Bu çelişki, grafın iki parçalı olmadığını doğrular.

Ancak, daha dikkatli incelediğimizde, verilen kenar listesinde bir hata olduğunu fark ediyoruz. Kenar listesinde (d,e) var, ancak çizimde d ve e arasında bir kenar yok. Eğer (d,e) kenarını çıkarırsak, graf iki parçalı olur ve düğümleri şu şekilde iki kümeye ayırabiliriz:
- Küme 1 (siyah): a, c, e
- Küme 2 (beyaz): b, d, f

Bu durumda, her kenar bir siyah düğümü bir beyaz düğüme bağlar ve graf iki parçalıdır.

## Problem 1.3: Graf İzomorfizmi

**Problem:** Aşağıdaki iki grafın izomorf olup olmadığını belirleyiniz. Eğer izomorflarsa, izomorfizmi (düğümler arasındaki eşlemeyi) gösteriniz.

Graf G₁:
- Düğümler: 1, 2, 3, 4, 5
- Kenarlar: (1,2), (1,3), (2,3), (2,4), (3,5), (4,5)

Graf G₂:
- Düğümler: a, b, c, d, e
- Kenarlar: (a,c), (a,d), (b,c), (b,e), (c,d), (d,e)

**Çözüm:**

İki grafın izomorf olması için, düğümleri arasında birebir ve örten bir eşleme olmalı ve bu eşleme kenar ilişkilerini korumalıdır. Yani, G₁'deki iki düğüm arasında bir kenar varsa, G₂'deki karşılık gelen düğümler arasında da bir kenar olmalıdır.

İlk olarak, her iki grafın da aynı sayıda düğüme (5) ve aynı sayıda kenara (6) sahip olduğunu kontrol edelim. Bu koşul sağlanıyor.

Şimdi, her düğümün derecesini kontrol edelim:

Graf G₁:
- d(1) = 2 (1 düğümü 2 ve 3 düğümlerine bağlıdır)
- d(2) = 3 (2 düğümü 1, 3 ve 4 düğümlerine bağlıdır)
- d(3) = 3 (3 düğümü 1, 2 ve 5 düğümlerine bağlıdır)
- d(4) = 2 (4 düğümü 2 ve 5 düğümlerine bağlıdır)
- d(5) = 2 (5 düğümü 3 ve 4 düğümlerine bağlıdır)

Graf G₂:
- d(a) = 2 (a düğümü c ve d düğümlerine bağlıdır)
- d(b) = 2 (b düğümü c ve e düğümlerine bağlıdır)
- d(c) = 3 (c düğümü a, b ve d düğümlerine bağlıdır)
- d(d) = 3 (d düğümü a, c ve e düğümlerine bağlıdır)
- d(e) = 2 (e düğümü b ve d düğümlerine bağlıdır)

Derece dizileri şöyledir:
- G₁: (2, 3, 3, 2, 2)
- G₂: (2, 2, 3, 3, 2)

Derece dizileri aynı, bu da izomorfizm için gerekli bir koşuldur, ancak yeterli değildir.

Şimdi, olası bir izomorfizm bulmaya çalışalım. Derece dizilerine göre, şu eşlemeleri düşünebiliriz:
- 1 (derece 2) → a veya b veya e (hepsi derece 2)
- 2 (derece 3) → c veya d (ikisi de derece 3)
- 3 (derece 3) → c veya d (ikisi de derece 3)
- 4 (derece 2) → a veya b veya e (hepsi derece 2)
- 5 (derece 2) → a veya b veya e (hepsi derece 2)

Olası bir eşleme deneyelim:
1 → a, 2 → c, 3 → d, 4 → b, 5 → e

Bu eşlemeyi kontrol edelim:
- (1,2) kenarı G₁'de var, (a,c) kenarı G₂'de var. ✓
- (1,3) kenarı G₁'de var, (a,d) kenarı G₂'de var. ✓
- (2,3) kenarı G₁'de var, (c,d) kenarı G₂'de var. ✓
- (2,4) kenarı G₁'de var, (c,b) kenarı G₂'de var. ✓
- (3,5) kenarı G₁'de var, (d,e) kenarı G₂'de var. ✓
- (4,5) kenarı G₁'de var, (b,e) kenarı G₂'de var. ✓

Tüm kenar ilişkileri korunuyor, bu yüzden bu eşleme bir izomorfizmdir. Dolayısıyla, G₁ ve G₂ izomorf graflardır.

İzomorfizm: 1 → a, 2 → c, 3 → d, 4 → b, 5 → e
