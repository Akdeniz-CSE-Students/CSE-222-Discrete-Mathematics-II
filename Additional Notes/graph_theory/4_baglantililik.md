# 4. Bağlantılılık (Connectivity)

## Bağlantılılık Kavramı

Bağlantılılık, graf teorisinin en temel kavramlarından biridir ve bir graftaki düğümler arasındaki erişilebilirliği ifade eder. Bir grafın bağlantılılık özellikleri, o grafın yapısı ve davranışı hakkında önemli bilgiler sağlar.

### Yol ve Bağlantılılık

İki düğüm arasında bir yol varsa, bu düğümlerin "bağlantılı" olduğu söylenir. Bir graf, herhangi iki düğümü arasında bir yol varsa "bağlantılı" (connected) olarak adlandırılır.

### Formal Tanım

Bir G = (V, E) grafında, u ve v düğümleri arasında bir yol varsa, u ve v "bağlantılı" olarak adlandırılır. Eğer G'deki her düğüm çifti bağlantılıysa, G "bağlantılı" bir graftır.

## Bağlantılı Bileşenler (Connected Components)

Eğer bir graf bağlantılı değilse, bağlantılı alt graflarına "bağlantılı bileşenler" (connected components) denir.

### Formal Tanım

Bir G = (V, E) grafının bir bağlantılı bileşeni, G'nin maksimal bağlantılı alt grafıdır. Yani, bileşene başka bir düğüm eklendiğinde, bileşen artık bağlantılı olmaz.

### Bağlantılı Bileşenlerin Bulunması

Bağlantılı bileşenleri bulmak için, grafı keşfetmek (explore) ve ziyaret edilen düğümleri işaretlemek gerekir. Bu, genellikle Derinlik Öncelikli Arama (DFS) veya Genişlik Öncelikli Arama (BFS) algoritmaları kullanılarak yapılır.

#### Algoritma: Bağlantılı Bileşenleri Bulma

```
Algorithm FindConnectedComponents(G):
    Initialize all vertices as unvisited
    For each vertex v in G:
        If v is unvisited:
            Create a new component C
            Explore(G, v, C)  // Add all vertices reachable from v to C
    Return all components

Algorithm Explore(G, v, C):
    Mark v as visited
    Add v to component C
    For each neighbor u of v:
        If u is unvisited:
            Explore(G, u, C)
```

Bu algoritma, grafın tüm bağlantılı bileşenlerini O(n + m) zamanda bulur, burada n düğüm sayısı ve m kenar sayısıdır.

## Güçlü Bağlantılılık (Strong Connectivity)

Yönlü graflarda, bağlantılılık kavramı biraz daha karmaşıktır. Yönlü bir grafta, u'dan v'ye bir yol olması, v'den u'ya bir yol olduğu anlamına gelmez.

### Formal Tanım

Yönlü bir G = (V, E) grafında, u ve v düğümleri, u'dan v'ye ve v'den u'ya yönlü yollar varsa "güçlü bağlantılı" (strongly connected) olarak adlandırılır. Eğer G'deki her düğüm çifti güçlü bağlantılıysa, G "güçlü bağlantılı" bir graftır.

### Güçlü Bağlantılı Bileşenler (Strongly Connected Components)

Yönlü bir grafın güçlü bağlantılı bileşenleri, grafın maksimal güçlü bağlantılı alt graflarıdır.

#### Kosaraju Algoritması

Güçlü bağlantılı bileşenleri bulmak için kullanılan bir algoritma, Kosaraju algoritmasıdır:

```
Algorithm Kosaraju(G):
    Perform a DFS on G and record the finish times of vertices
    Create G_transpose by reversing all edges in G
    Perform a DFS on G_transpose, starting with vertices in decreasing order of finish time
    Each DFS tree in the second DFS is a strongly connected component
```

Bu algoritma, grafın tüm güçlü bağlantılı bileşenlerini O(n + m) zamanda bulur.

## Köprüler ve Eklem Noktaları

Bir grafın bağlantılılık yapısını anlamak için, köprüler ve eklem noktaları önemli kavramlardır.

### Köprü (Bridge)

Bir kenar, çıkarıldığında grafın bağlantılı bileşen sayısını artırıyorsa, bu kenara "köprü" denir.

#### Örnek

Aşağıdaki grafta, (a, b) kenarı bir köprüdür, çünkü bu kenar çıkarıldığında, graf iki bağlantılı bileşene ayrılır.

```
    a -- b -- c
         |    |
         d -- e
```

### Eklem Noktası (Articulation Point)

Bir düğüm, çıkarıldığında (ve ona bağlı tüm kenarlar da çıkarıldığında) grafın bağlantılı bileşen sayısını artırıyorsa, bu düğüme "eklem noktası" denir.

#### Örnek

Aynı grafta, b düğümü bir eklem noktasıdır, çünkü b çıkarıldığında, graf iki bağlantılı bileşene ayrılır.

### Köprülerin ve Eklem Noktalarının Bulunması

Köprüleri ve eklem noktalarını bulmak için, Tarjan algoritması kullanılabilir. Bu algoritma, DFS ağacını kullanarak, bir düğümün veya kenarın çıkarılmasının grafın bağlantılılığını nasıl etkileyeceğini belirler.

## Bağlantılılık Ölçüleri

Bir grafın bağlantılılık derecesini ölçmek için çeşitli metrikler kullanılır.

### Düğüm Bağlantılılığı (Vertex Connectivity)

Bir grafın düğüm bağlantılılığı, grafı bağlantısız hale getirmek için çıkarılması gereken minimum düğüm sayısıdır. Düğüm bağlantılılığı κ(G) olarak gösterilir.

### Kenar Bağlantılılığı (Edge Connectivity)

Bir grafın kenar bağlantılılığı, grafı bağlantısız hale getirmek için çıkarılması gereken minimum kenar sayısıdır. Kenar bağlantılılığı λ(G) olarak gösterilir.

### Menger Teoremi

Menger teoremi, düğüm ve kenar bağlantılılığı ile ilgili önemli bir sonuçtur:

- İki düğüm u ve v arasındaki düğüm bağlantılılığı, u ve v arasındaki düğüm-ayrık yolların maksimum sayısına eşittir.
- İki düğüm u ve v arasındaki kenar bağlantılılığı, u ve v arasındaki kenar-ayrık yolların maksimum sayısına eşittir.

## Bağlantılılık Algoritmaları

Bağlantılılık problemlerini çözmek için çeşitli algoritmalar kullanılır.

### Derinlik Öncelikli Arama (DFS)

DFS, bir grafı keşfetmek için kullanılan temel bir algoritmadır. Bir düğümden başlayarak, mümkün olduğunca derine iner ve sonra geri döner.

```
Algorithm DFS(G, v):
    Mark v as visited
    For each neighbor u of v:
        If u is unvisited:
            DFS(G, u)
```

DFS, bağlantılı bileşenleri, köprüleri ve eklem noktalarını bulmak için kullanılabilir.

### Genişlik Öncelikli Arama (BFS)

BFS, bir grafı keşfetmek için kullanılan başka bir temel algoritmadır. Bir düğümden başlayarak, önce tüm komşularını ziyaret eder, sonra komşularının komşularını ziyaret eder ve böyle devam eder.

```
Algorithm BFS(G, v):
    Mark v as visited
    Initialize a queue Q with v
    While Q is not empty:
        Dequeue a vertex u from Q
        For each neighbor w of u:
            If w is unvisited:
                Mark w as visited
                Enqueue w to Q
```

BFS, en kısa yolları bulmak ve bağlantılılık testleri yapmak için kullanılabilir.

## Bağlantılılığın Uygulamaları

Bağlantılılık kavramı, birçok gerçek dünya probleminde kullanılır:

1. **Ağ Güvenilirliği**: Bir ağın bağlantılılığı, ağın güvenilirliğini ölçer. Yüksek bağlantılılık, ağın daha güvenilir olduğu anlamına gelir.

2. **Sosyal Ağ Analizi**: Sosyal ağlarda, bağlantılı bileşenler toplulukları temsil edebilir. Güçlü bağlantılı bileşenler, üyeleri arasında güçlü etkileşimlerin olduğu grupları gösterir.

3. **Ulaşım Ağları**: Ulaşım ağlarında, köprüler ve eklem noktaları, ağın zayıf noktalarını gösterir. Bu noktaların arızalanması, ağın bağlantılılığını önemli ölçüde etkileyebilir.

4. **İnternet Topolojisi**: İnternetin topolojisi, yönlendiriciler (düğümler) ve bağlantılar (kenarlar) arasındaki bağlantılılık ile karakterize edilir. Yüksek bağlantılılık, internetin dayanıklılığını artırır.

5. **Kimyasal Bileşikler**: Moleküler yapılarda, bağlantılılık özellikleri, molekülün kimyasal özelliklerini belirler.

## Bağlantılılık ve Diğer Graf Özellikleri

Bağlantılılık, diğer graf özellikleriyle de ilişkilidir:

1. **Düzlemsellik**: Düzlemsel graflarda, köprüler ve eklem noktaları, grafın yapısını anlamak için önemlidir.

2. **Ağaçlar**: Ağaçlar, tam olarak bir bağlantılı bileşene sahip olan ve döngüsüz olan graflardır. Ağaçlarda, her kenar bir köprüdür ve iç düğümler eklem noktalarıdır.

3. **Çift Bağlantılılık**: Bir graf, hiçbir eklem noktası yoksa "çift bağlantılı" (biconnected) olarak adlandırılır. Çift bağlantılı graflarda, herhangi bir düğümün çıkarılması grafı bağlantısız hale getirmez.

4. **Üç Bağlantılılık**: Bir graf, en az üç düğümün çıkarılması gerekiyorsa grafı bağlantısız hale getirmek için "üç bağlantılı" (triconnected) olarak adlandırılır.

## Gerçek Hayat Örnekleri

Bağlantılılık kavramı, günlük hayatta birçok yerde karşımıza çıkar:

1. **Sosyal Medya**: Facebook gibi sosyal medya platformlarında, arkadaşlık ilişkileri bir graf oluşturur. Bu grafta, bağlantılı bileşenler, birbiriyle etkileşimde bulunan insan gruplarını temsil eder.

2. **Ulaşım Ağları**: Şehirler arası yol ağında, köprüler ve tüneller genellikle gerçek köprülerdir. Bu yapıların kapanması, ulaşım ağının bağlantılılığını önemli ölçüde etkileyebilir.

3. **İnternet**: İnternette, yönlendiriciler ve sunucular düğümleri, fiber optik kablolar ve diğer iletişim hatları kenarları temsil eder. Bu ağın bağlantılılığı, internetin güvenilirliğini belirler.

4. **Elektrik Şebekeleri**: Elektrik şebekelerinde, güç santralleri ve transformatör istasyonları düğümleri, iletim hatları kenarları temsil eder. Bu ağın bağlantılılığı, elektrik dağıtımının güvenilirliğini belirler.

5. **Biyolojik Ağlar**: Protein etkileşim ağlarında, proteinler düğümleri, etkileşimler kenarları temsil eder. Bu ağın bağlantılılık özellikleri, biyolojik süreçleri anlamak için önemlidir.

Bağlantılılık, graf teorisinin en temel ve en önemli kavramlarından biridir ve birçok gerçek dünya problemini modellemek ve çözmek için kullanılır.
