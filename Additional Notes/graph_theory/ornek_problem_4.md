# Örnek Problem 4: Ağlar ve Akışlar

## Problem 4.1: Maksimum Akış

**Problem:** Aşağıdaki ağ için Ford-Fulkerson algoritmasını kullanarak maksimum akışı bulunuz:

- Düğümler: s (kaynak), t (hedef), a, b, c, d
- Kenarlar ve kapasiteleri: (s,a,10), (s,c,8), (a,b,5), (a,c,2), (b,t,7), (b,d,3), (c,d,6), (d,t,10)

**Çözüm:**

Ford-Fulkerson algoritması, artırma yolları bulunduğu sürece akışı artırarak maksimum akışı bulan bir algoritmadır. Adım adım uygulayalım:

1. Başlangıç durumu:
   - Tüm kenarlardaki akış 0 olarak başlatılır.
   - Artık ağ, orijinal ağ ile aynıdır.

2. İlk artırma yolu: s → a → b → t
   - Bu yoldaki minimum kapasite: min(10, 5, 7) = 5
   - Akışı güncelle:
     - f(s,a) = 5
     - f(a,b) = 5
     - f(b,t) = 5

3. İkinci artırma yolu: s → c → d → t
   - Bu yoldaki minimum kapasite: min(8, 6, 10) = 6
   - Akışı güncelle:
     - f(s,c) = 6
     - f(c,d) = 6
     - f(d,t) = 6

4. Üçüncü artırma yolu: s → a → c → d → t
   - Bu yoldaki minimum kapasite: min(10-5, 2, 6-6, 10-6) = min(5, 2, 0, 4) = 0
   - Bu yol geçerli değil çünkü (c,d) kenarının artık kapasitesi 0.

5. Dördüncü artırma yolu: s → c → d → b → t
   - Bu yoldaki minimum kapasite: min(8-6, 6-6, 0, 7-5) = min(2, 0, 0, 2) = 0
   - Bu yol geçerli değil çünkü (c,d) kenarının artık kapasitesi 0.

6. Beşinci artırma yolu: s → a → b → d → t
   - Bu yoldaki minimum kapasite: min(10-5, 5-5, 3, 10-6) = min(5, 0, 3, 4) = 0
   - Bu yol geçerli değil çünkü (a,b) kenarının artık kapasitesi 0.

Artık başka artırma yolu bulunamadığından, algoritma sona erer. Maksimum akış, kaynaktan çıkan toplam akıştır:
f(s,a) + f(s,c) = 5 + 6 = 11

Alternatif olarak, hedefe giren toplam akış da aynı değeri verir:
f(b,t) + f(d,t) = 5 + 6 = 11

Dolayısıyla, maksimum akış 11'dir.

## Problem 4.2: Minimum Kesit

**Problem:** Aşağıdaki ağ için minimum kesiti bulunuz ve kapasitesini hesaplayınız:

- Düğümler: s (kaynak), t (hedef), a, b, c, d
- Kenarlar ve kapasiteleri: (s,a,12), (s,b,8), (a,b,5), (a,c,10), (b,d,7), (c,t,15), (d,c,3), (d,t,10)

**Çözüm:**

Minimum kesit, ağı kaynak ve hedef düğümlerini ayıran iki parçaya bölen ve toplam kapasitesi minimum olan kenar kümesidir. Maksimum akış - minimum kesit teoremi, bir ağdaki maksimum akışın değerinin, minimum kesit kapasitesine eşit olduğunu belirtir.

Önce Ford-Fulkerson algoritmasını kullanarak maksimum akışı bulalım:

1. İlk artırma yolu: s → a → c → t
   - Bu yoldaki minimum kapasite: min(12, 10, 15) = 10
   - Akışı güncelle:
     - f(s,a) = 10
     - f(a,c) = 10
     - f(c,t) = 10

2. İkinci artırma yolu: s → b → d → t
   - Bu yoldaki minimum kapasite: min(8, 7, 10) = 7
   - Akışı güncelle:
     - f(s,b) = 7
     - f(b,d) = 7
     - f(d,t) = 7

3. Üçüncü artırma yolu: s → b → d → c → t
   - Bu yoldaki minimum kapasite: min(8-7, 7-7, 3, 15-10) = min(1, 0, 3, 5) = 0
   - Bu yol geçerli değil çünkü (b,d) kenarının artık kapasitesi 0.

4. Dördüncü artırma yolu: s → a → b → d → t
   - Bu yoldaki minimum kapasite: min(12-10, 5, 7-7, 10-7) = min(2, 5, 0, 3) = 0
   - Bu yol geçerli değil çünkü (b,d) kenarının artık kapasitesi 0.

5. Beşinci artırma yolu: s → a → b → d → c → t
   - Bu yoldaki minimum kapasite: min(12-10, 5, 7-7, 3, 15-10) = min(2, 5, 0, 3, 5) = 0
   - Bu yol geçerli değil çünkü (b,d) kenarının artık kapasitesi 0.

Maksimum akış 10 + 7 = 17'dir.

Minimum kesiti bulmak için, maksimum akış sonrası artık ağda kaynaktan erişilebilen düğümleri (S kümesi) ve erişilemeyen düğümleri (T kümesi) belirleriz:
- S = {s, a, b}
- T = {c, d, t}

Minimum kesit, S'den T'ye giden kenarlardan oluşur:
- (a,c) kapasitesi 10
- (b,d) kapasitesi 7

Minimum kesit kapasitesi = 10 + 7 = 17, bu da maksimum akışa eşittir.

## Problem 4.3: Bipartite Eşleştirme

**Problem:** Aşağıdaki iki parçalı graf için maksimum eşleştirmeyi bulunuz:

- Sol küme: A, B, C, D, E
- Sağ küme: 1, 2, 3, 4, 5
- Kenarlar: (A,1), (A,2), (B,2), (B,3), (C,3), (C,4), (D,1), (D,5), (E,4), (E,5)

**Çözüm:**

Bipartite eşleştirme problemi, bir ağ akışı problemi olarak modellenebilir. Bunun için:
1. Bir kaynak düğümü s ekleyelim ve sol kümedeki tüm düğümlere bağlayalım, kapasite 1.
2. Bir hedef düğümü t ekleyelim ve sağ kümedeki tüm düğümlere bağlayalım, kapasite 1.
3. Orijinal graftaki her kenar için, sol düğümden sağ düğüme bir kenar ekleyelim, kapasite 1.
4. Maksimum akışı bulalım, bu maksimum eşleştirme sayısına eşittir.

Artırma yolu algoritmasını kullanarak maksimum eşleştirmeyi bulalım:

1. İlk artırma yolu: s → A → 1 → t
   - Eşleştirmeye ekle: (A,1)

2. İkinci artırma yolu: s → B → 2 → t
   - Eşleştirmeye ekle: (B,2)

3. Üçüncü artırma yolu: s → C → 3 → t
   - Eşleştirmeye ekle: (C,3)

4. Dördüncü artırma yolu: s → D → 5 → t
   - Eşleştirmeye ekle: (D,5)

5. Beşinci artırma yolu: s → E → 4 → t
   - Eşleştirmeye ekle: (E,4)

Artık başka artırma yolu bulunamadığından, algoritma sona erer. Maksimum eşleştirme:
{(A,1), (B,2), (C,3), (D,5), (E,4)}

Bu eşleştirmede, sol kümedeki her düğüm sağ kümedeki bir düğümle eşleştirilmiştir ve sağ kümedeki her düğüm sol kümedeki bir düğümle eşleştirilmiştir. Bu, tam bir eşleştirmedir ve boyutu 5'tir.

Alternatif olarak, farklı bir eşleştirme de mümkündür, örneğin:
{(A,2), (B,3), (C,4), (D,1), (E,5)}

Bu da tam bir eşleştirmedir ve boyutu 5'tir. Maksimum eşleştirme boyutu 5'tir, ancak maksimum eşleştirmenin kendisi benzersiz olmayabilir.
