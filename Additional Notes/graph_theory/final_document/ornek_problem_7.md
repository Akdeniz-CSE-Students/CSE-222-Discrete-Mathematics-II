# Örnek Problem 7: Karmaşıklık Konuları

## Problem 7.1: NP-Tam Problemler

**Problem:** Aşağıdaki graf problemlerinin her biri için, problemin hangi karmaşıklık sınıfına ait olduğunu belirtiniz (P, NP, NP-tam veya NP-zor) ve nedenini açıklayınız:

1. Bir grafın bağlantılı olup olmadığını belirleme
2. Bir grafta Hamilton döngüsü olup olmadığını belirleme
3. Bir grafı 3 renkle renklendirmenin mümkün olup olmadığını belirleme
4. Bir grafın minimum kapsayan ağacını bulma
5. Bir grafta maksimum klik bulma

**Çözüm:**

1. **Bir grafın bağlantılı olup olmadığını belirleme**
   - Karmaşıklık sınıfı: P
   - Açıklama: Bu problem, derinlik öncelikli arama (DFS) veya genişlik öncelikli arama (BFS) kullanılarak polinom zamanda çözülebilir. Algoritma, herhangi bir düğümden başlayarak grafı keşfeder ve tüm düğümlerin ziyaret edilip edilmediğini kontrol eder. Zaman karmaşıklığı O(n + m)'dir, burada n düğüm sayısı ve m kenar sayısıdır.

2. **Bir grafta Hamilton döngüsü olup olmadığını belirleme**
   - Karmaşıklık sınıfı: NP-tam
   - Açıklama: Hamilton döngüsü problemi, klasik bir NP-tam problemdir. Bir çözümün doğrulanması polinom zamanda yapılabilir (tüm düğümlerin tam olarak bir kez ziyaret edildiğini ve başlangıç düğümüne döndüğünü kontrol etmek), ancak çözümü bulmak için bilinen en iyi algoritma üstel zamanda çalışır. Bu problem, SAT problemine polinom zamanda indirgenebilir, bu da NP-tam olduğunu gösterir.

3. **Bir grafı 3 renkle renklendirmenin mümkün olup olmadığını belirleme**
   - Karmaşıklık sınıfı: NP-tam
   - Açıklama: 3-renklendirme problemi, klasik bir NP-tam problemdir. Bir renklendirmenin doğrulanması polinom zamanda yapılabilir (her düğüm çiftinin farklı renklere sahip olduğunu kontrol etmek), ancak çözümü bulmak için bilinen en iyi algoritma üstel zamanda çalışır. Bu problem, SAT problemine polinom zamanda indirgenebilir, bu da NP-tam olduğunu gösterir.

4. **Bir grafın minimum kapsayan ağacını bulma**
   - Karmaşıklık sınıfı: P
   - Açıklama: Minimum kapsayan ağaç problemi, Kruskal veya Prim algoritmaları kullanılarak polinom zamanda çözülebilir. Kruskal algoritması O(m log m) zamanda, Prim algoritması O(m + n log n) zamanda çalışır. Bu, problemi P sınıfına yerleştirir.

5. **Bir grafta maksimum klik bulma**
   - Karmaşıklık sınıfı: NP-zor
   - Açıklama: Maksimum klik problemi, klasik bir NP-zor problemdir. Bir kliğin doğrulanması polinom zamanda yapılabilir (her düğüm çiftinin bağlı olduğunu kontrol etmek), ancak maksimum kliği bulmak için bilinen en iyi algoritma üstel zamanda çalışır. Bu problem, karar versiyonu NP-tam olduğundan ve optimizasyon versiyonu en az o kadar zor olduğundan NP-zordur.

## Problem 7.2: Yaklaşık Algoritmalar

**Problem:** Aşağıdaki ağırlıklı tam graf için, Gezgin Satıcı Problemi'nin (TSP) çözümünü bulmak için:
1. En yakın komşu algoritmasını kullanarak bir tur bulunuz.
2. 2-opt algoritmasını kullanarak turu iyileştiriniz.
3. Optimal tur ile yaklaşık çözüm arasındaki farkı tartışınız.

Graf G:
- Düğümler: A, B, C, D, E
- Kenar ağırlıkları:
  - (A,B): 12, (A,C): 19, (A,D): 8, (A,E): 15
  - (B,C): 7, (B,D): 14, (B,E): 18
  - (C,D): 10, (C,E): 5
  - (D,E): 11

**Çözüm:**

1. **En yakın komşu algoritması**:
   
   A düğümünden başlayalım:
   - A'dan en yakın düğüm: D (mesafe: 8)
   - D'den en yakın ziyaret edilmemiş düğüm: C (mesafe: 10)
   - C'den en yakın ziyaret edilmemiş düğüm: E (mesafe: 5)
   - E'den en yakın ziyaret edilmemiş düğüm: B (mesafe: 18)
   - Turu tamamlamak için B'den A'ya dönüş (mesafe: 12)
   
   Tur: A → D → C → E → B → A
   Toplam uzunluk: 8 + 10 + 5 + 18 + 12 = 53

2. **2-opt algoritması**:
   
   2-opt algoritması, mevcut turdaki iki kenarı çıkarıp iki yeni kenarla değiştirerek turu iyileştirir. Mevcut turumuz A → D → C → E → B → A'dır.
   
   Olası tüm 2-opt değişimlerini kontrol edelim:
   
   - (A,D) ve (C,E) kenarlarını çıkarıp (A,C) ve (D,E) kenarlarıyla değiştir:
     Yeni tur: A → C → D → E → B → A
     Yeni uzunluk: 19 + 10 + 11 + 18 + 12 = 70
     Bu değişim turu kötüleştirir.
   
   - (A,D) ve (E,B) kenarlarını çıkarıp (A,E) ve (D,B) kenarlarıyla değiştir:
     Yeni tur: A → E → C → D → B → A
     Yeni uzunluk: 15 + 5 + 10 + 14 + 12 = 56
     Bu değişim turu kötüleştirir.
   
   - (D,C) ve (B,A) kenarlarını çıkarıp (D,B) ve (C,A) kenarlarıyla değiştir:
     Yeni tur: A → D → B → E → C → A
     Yeni uzunluk: 8 + 14 + 18 + 5 + 19 = 64
     Bu değişim turu kötüleştirir.
   
   - (C,E) ve (B,A) kenarlarını çıkarıp (C,B) ve (E,A) kenarlarıyla değiştir:
     Yeni tur: A → D → C → B → E → A
     Yeni uzunluk: 8 + 10 + 7 + 18 + 15 = 58
     Bu değişim turu kötüleştirir.
   
   Hiçbir 2-opt değişimi turu iyileştirmediğinden, mevcut tur yerel olarak optimaldir.

3. **Optimal tur ile karşılaştırma**:
   
   Bu küçük örnekte, tüm olası turları deneyerek optimal turu bulabiliriz. Ancak, gerçek dünya problemlerinde, bu yaklaşım pratik değildir çünkü n düğümlü bir grafta (n-1)!/2 farklı tur vardır.
   
   Optimal tur: A → D → E → C → B → A
   Optimal uzunluk: 8 + 11 + 5 + 7 + 12 = 43
   
   En yakın komşu algoritması ile bulunan tur: A → D → C → E → B → A
   Yaklaşık çözüm uzunluğu: 53
   
   Yaklaşık çözüm, optimal çözümden %23 daha kötüdür ((53-43)/43 ≈ 0.23).
   
   Bu, en yakın komşu algoritmasının her zaman optimal çözümü bulmadığını gösterir. Ancak, büyük problemler için makul bir yaklaşım sağlar ve hesaplama karmaşıklığı O(n²)'dir, bu da büyük örnekler için pratiktir.

## Problem 7.3: Sabit Parametre Uygulanabilir Algoritmalar

**Problem:** Aşağıdaki graf için:
1. Grafın ağaç genişliğini (tree width) belirleyiniz.
2. Ağaç ayrışımını (tree decomposition) bulunuz.
3. Ağaç genişliği küçük olan graflarda, hangi NP-zor problemlerin verimli bir şekilde çözülebileceğini tartışınız.

Graf G:
- Düğümler: 1, 2, 3, 4, 5, 6
- Kenarlar: (1,2), (1,3), (2,3), (2,4), (3,4), (3,5), (4,6), (5,6)

**Çözüm:**

1. **Grafın ağaç genişliği**:
   
   Ağaç genişliği, bir grafın ağaç benzeri yapısını ölçen bir parametredir. Formal olarak, bir grafın ağaç genişliği, grafın tüm olası ağaç ayrışımları arasında, her torbadaki maksimum düğüm sayısının en küçük değeri eksi 1'dir.
   
   Verilen graf için, ağaç genişliğini belirlemek için önce bir ağaç ayrışımı bulalım.

2. **Ağaç ayrışımı**:
   
   Bir ağaç ayrışımı, grafın düğümlerini içeren torbalardan oluşan bir ağaçtır, öyle ki:
   - Her düğüm en az bir torbada bulunur.
   - Her kenarın uç noktaları en az bir torbada birlikte bulunur.
   - Bir düğümü içeren tüm torbalar, ağaç ayrışımında bağlantılı bir alt ağaç oluşturur.
   
   Verilen graf için bir ağaç ayrışımı:
   
   Torba 1: {1, 2, 3}
   Torba 2: {2, 3, 4}
   Torba 3: {3, 4, 5}
   Torba 4: {4, 5, 6}
   
   Ağaç yapısı:
   Torba 1 -- Torba 2 -- Torba 3 -- Torba 4
   
   Bu ağaç ayrışımında, her torbada 3 düğüm vardır, bu nedenle ağaç genişliği 3 - 1 = 2'dir.
   
   Daha küçük bir ağaç genişliği mümkün mü? Grafın 3-düğümlü bir döngüsü (1-2-3) vardır, bu nedenle ağaç genişliği en az 2 olmalıdır. Dolayısıyla, grafın ağaç genişliği 2'dir.

3. **Ağaç genişliği küçük olan graflarda verimli çözülebilen NP-zor problemler**:
   
   Ağaç genişliği k olan bir grafta, birçok NP-zor problem O(f(k) · n) zamanda çözülebilir, burada f(k) sadece k'ye bağlı bir fonksiyondur ve n grafın boyutudur. Bu, bu problemlerin sabit parametre uygulanabilir (FPT) olduğu anlamına gelir.
   
   Ağaç genişliği küçük olan graflarda verimli çözülebilen bazı NP-zor problemler:
   
   - **Bağımsız Küme (Independent Set)**: Ağaç genişliği k olan bir grafta, maksimum bağımsız küme O(2^k · k · n) zamanda bulunabilir.
   
   - **Düğüm Örtüsü (Vertex Cover)**: Ağaç genişliği k olan bir grafta, minimum düğüm örtüsü O(2^k · k · n) zamanda bulunabilir.
   
   - **Hamilton Döngüsü (Hamiltonian Cycle)**: Ağaç genişliği k olan bir grafta, Hamilton döngüsü varlığı O(k^k · n) zamanda belirlenebilir.
   
   - **Graf Renklendirme (Graph Coloring)**: Ağaç genişliği k olan bir grafta, minimum renklendirme O(k^k · n) zamanda bulunabilir.
   
   - **Maksimum Klik (Maximum Clique)**: Ağaç genişliği k olan bir grafta, maksimum klik O(2^k · k · n) zamanda bulunabilir.
   
   Bu algoritmaların çoğu, dinamik programlama tekniklerini kullanır ve ağaç ayrışımı üzerinde çalışır. Ağaç genişliği küçük olan graflarda, bu problemler pratik olarak çözülebilir hale gelir, oysa genel graflarda üstel zaman gerektirir.
   
   Örneğin, sosyal ağlar, yol ağları ve birçok gerçek dünya grafı genellikle küçük ağaç genişliğine sahiptir, bu da bu tekniklerin pratik uygulamalarda kullanılabileceği anlamına gelir.
