# 6. Ağaçlar (Trees)

## Ağaç Kavramı

Ağaç, döngüsüz ve bağlantılı bir graftır. Ağaçlar, hiyerarşik yapıları modellemek için kullanılan özel bir graf türüdür ve bilgisayar biliminde, veri yapıları ve algoritmalarda yaygın olarak kullanılır.

### Formal Tanım

Bir G = (V, E) grafı, aşağıdaki özelliklerden herhangi birini sağlıyorsa bir ağaçtır:
1. G döngüsüz ve bağlantılıdır.
2. G bağlantılıdır ve |E| = |V| - 1'dir.
3. G döngüsüzdür ve |E| = |V| - 1'dir.
4. G'deki herhangi iki düğüm arasında tam olarak bir yol vardır.
5. G döngüsüzdür ve herhangi bir kenar eklenmesi tam olarak bir döngü oluşturur.
6. G bağlantılıdır ve herhangi bir kenarın çıkarılması G'yi bağlantısız hale getirir.

Bu özelliklerin hepsi birbirine eşdeğerdir, yani bir ağaç bu özelliklerden birini sağlıyorsa, diğerlerini de sağlar.

## Ağaç Terminolojisi

### Kök (Root)

Bir ağaçta, özel olarak belirlenmiş bir düğüme "kök" denir. Kök, ağacın hiyerarşisinin en üstünde yer alır. Kök belirlendiğinde, ağaç "köklü ağaç" (rooted tree) olarak adlandırılır.

### Yaprak (Leaf)

Bir ağaçta, derecesi 1 olan düğümlere "yaprak" denir. Yapraklar, ağacın hiyerarşisinin en altında yer alır ve çocuk düğümleri yoktur.

### İç Düğüm (Internal Node)

Bir ağaçta, kök ve yaprak olmayan düğümlere "iç düğüm" denir. İç düğümler, hem ebeveyn hem de çocuk düğümlere sahiptir.

### Ebeveyn ve Çocuk (Parent and Child)

Köklü bir ağaçta, iki komşu düğüm arasında bir hiyerarşi vardır. Köke daha yakın olan düğüm "ebeveyn", diğeri "çocuk" olarak adlandırılır.

### Kardeş (Sibling)

Aynı ebeveyne sahip düğümlere "kardeş" denir.

### Ata ve Torun (Ancestor and Descendant)

Bir düğümden köke giden yoldaki tüm düğümler, o düğümün "ataları"dır. Benzer şekilde, bir düğümden yapraklara giden yollardaki tüm düğümler, o düğümün "torunları"dır.

### Derinlik ve Yükseklik (Depth and Height)

Bir düğümün "derinliği", kökten o düğüme olan yolun uzunluğudur. Kökün derinliği 0'dır.

Bir düğümün "yüksekliği", o düğümden herhangi bir yaprağa olan en uzun yolun uzunluğudur. Yaprakların yüksekliği 0'dır.

Bir ağacın "yüksekliği", kökün yüksekliğidir, yani ağaçtaki en uzun yolun uzunluğudur.

### Alt Ağaç (Subtree)

Bir düğüm ve onun tüm torunları, bir "alt ağaç" oluşturur.

## Ağaç Türleri

### İkili Ağaç (Binary Tree)

İkili ağaç, her düğümün en fazla iki çocuğa sahip olduğu bir ağaçtır. İkili ağaçlar, bilgisayar biliminde yaygın olarak kullanılır.

#### Tam İkili Ağaç (Full Binary Tree)

Tam ikili ağaç, her düğümün ya 0 ya da 2 çocuğa sahip olduğu bir ikili ağaçtır.

#### Tam Dolu İkili Ağaç (Complete Binary Tree)

Tam dolu ikili ağaç, son seviye hariç tüm seviyelerin tamamen dolu olduğu ve son seviyedeki tüm düğümlerin mümkün olduğunca sola yerleştirildiği bir ikili ağaçtır.

#### Mükemmel İkili Ağaç (Perfect Binary Tree)

Mükemmel ikili ağaç, tüm iç düğümlerin tam olarak iki çocuğa sahip olduğu ve tüm yaprakların aynı seviyede olduğu bir ikili ağaçtır.

#### Dengeli İkili Ağaç (Balanced Binary Tree)

Dengeli ikili ağaç, her düğümün sol ve sağ alt ağaçlarının yükseklikleri arasındaki farkın en fazla 1 olduğu bir ikili ağaçtır.

### k-ary Ağaç (k-ary Tree)

k-ary ağaç, her düğümün en fazla k çocuğa sahip olduğu bir ağaçtır.

### Kapsayan Ağaç (Spanning Tree)

Kapsayan ağaç, bir grafın tüm düğümlerini içeren ve döngüsüz olan bir alt grafıdır. Bir grafın birden fazla kapsayan ağacı olabilir.

#### Minimum Kapsayan Ağaç (Minimum Spanning Tree)

Ağırlıklı bir grafta, minimum kapsayan ağaç, toplam ağırlığı minimum olan bir kapsayan ağaçtır.

## Ağaç Algoritmaları

### Ağaç Dolaşımı (Tree Traversal)

Ağaç dolaşımı, bir ağaçtaki tüm düğümleri belirli bir sırayla ziyaret etme işlemidir. İkili ağaçlar için üç temel dolaşım yöntemi vardır:

#### Preorder Dolaşım

Preorder dolaşımda, önce kök, sonra sol alt ağaç, sonra sağ alt ağaç ziyaret edilir:

```
Algorithm PreorderTraversal(node):
    If node is null:
        Return
    Visit node
    PreorderTraversal(node.left)
    PreorderTraversal(node.right)
```

#### Inorder Dolaşım

Inorder dolaşımda, önce sol alt ağaç, sonra kök, sonra sağ alt ağaç ziyaret edilir:

```
Algorithm InorderTraversal(node):
    If node is null:
        Return
    InorderTraversal(node.left)
    Visit node
    InorderTraversal(node.right)
```

#### Postorder Dolaşım

Postorder dolaşımda, önce sol alt ağaç, sonra sağ alt ağaç, sonra kök ziyaret edilir:

```
Algorithm PostorderTraversal(node):
    If node is null:
        Return
    PostorderTraversal(node.left)
    PostorderTraversal(node.right)
    Visit node
```

#### Seviye Sıralı Dolaşım (Level Order Traversal)

Seviye sıralı dolaşımda, düğümler seviye seviye, soldan sağa ziyaret edilir:

```
Algorithm LevelOrderTraversal(root):
    If root is null:
        Return
    Initialize a queue Q
    Enqueue root to Q
    While Q is not empty:
        Dequeue a node from Q
        Visit the node
        Enqueue the node's children to Q
```

### Minimum Kapsayan Ağaç Algoritmaları

#### Kruskal Algoritması

Kruskal algoritması, bir grafın minimum kapsayan ağacını bulmak için kullanılır:

```
Algorithm Kruskal(G):
    Sort all edges in non-decreasing order of their weight
    Initialize an empty set T for the minimum spanning tree
    For each edge (u, v) in the sorted order:
        If adding (u, v) to T does not create a cycle:
            Add (u, v) to T
    Return T
```

#### Prim Algoritması

Prim algoritması, bir grafın minimum kapsayan ağacını bulmak için kullanılan başka bir algoritmadır:

```
Algorithm Prim(G, r):
    Initialize an empty set T for the minimum spanning tree
    Initialize a priority queue Q with all vertices
    Set key[r] = 0 and key[v] = infinity for all other vertices
    While Q is not empty:
        Extract vertex u with minimum key from Q
        Add u to T
        For each neighbor v of u:
            If v is in Q and weight(u, v) < key[v]:
                Set key[v] = weight(u, v)
                Set parent[v] = u
    Return T
```

## Ağaçların Özellikleri

### Düğüm Sayısı ve Kenar Sayısı

Bir ağaçta, düğüm sayısı n ise, kenar sayısı n-1'dir.

### Yaprak Sayısı

Bir ikili ağaçta, iç düğüm sayısı i ise, yaprak sayısı i+1'dir.

### Yükseklik ve Düğüm Sayısı İlişkisi

Bir ikili ağacın yüksekliği h ise, düğüm sayısı en az h+1, en fazla 2^(h+1)-1'dir.

### Ağaçların Sayısı

n etiketli düğüm için olası farklı ağaç sayısı n^(n-2)'dir (Cayley formülü).

## Ağaçların Uygulamaları

### Hiyerarşik Veri Yapıları

Ağaçlar, dosya sistemleri, organizasyon şemaları ve sınıflandırma sistemleri gibi hiyerarşik yapıları modellemek için kullanılır.

### İkili Arama Ağaçları

İkili arama ağaçları, verileri sıralı bir şekilde depolamak ve hızlı arama, ekleme ve silme işlemleri yapmak için kullanılır.

### Karar Ağaçları

Karar ağaçları, makine öğrenmesinde sınıflandırma ve regresyon problemlerini çözmek için kullanılır.

### Sözdizimi Ağaçları

Sözdizimi ağaçları, programlama dillerinde kod yapısını temsil etmek için kullanılır.

### Ağ Topolojisi

Ağaçlar, bilgisayar ağlarında, özellikle yayın ağlarında, veri iletimini optimize etmek için kullanılır.

## Ağaçlar ve Diğer Graf Yapıları

### Ağaçlar ve Ormanlar

Ormanlar, ağaçların birleşimidir. Bir orman, döngüsüz bir graftır, ancak bağlantılı olmak zorunda değildir.

### Ağaçlar ve Çift Parçalı Graflar

Her ağaç, bir çift parçalı graftır. Bu, ağaçların düğümlerini iki kümeye ayırabileceğimiz ve tüm kenarların bu iki küme arasında olacağı anlamına gelir.

### Ağaçlar ve Düzlemsel Graflar

Tüm ağaçlar düzlemseldir, yani kenarları kesişmeden bir düzlemde çizilebilirler.

## Gerçek Hayat Örnekleri

Ağaçlar, günlük hayatta birçok yerde karşımıza çıkar:

1. **Dosya Sistemleri**: Bilgisayar dosya sistemleri, klasörler ve dosyalar arasındaki hiyerarşiyi temsil etmek için ağaç yapısını kullanır.

2. **Organizasyon Şemaları**: Şirketlerdeki hiyerarşik yapı, bir ağaç olarak modellenebilir, CEO kök düğümü, departman yöneticileri iç düğümleri ve çalışanlar yaprakları temsil eder.

3. **Aile Ağaçları**: Aile ilişkileri, bir ağaç yapısıyla temsil edilebilir, atalar kök düğümü, ebeveynler iç düğümleri ve çocuklar yaprakları temsil eder.

4. **Web Sayfaları**: HTML belgeleri, DOM (Document Object Model) adı verilen bir ağaç yapısıyla temsil edilir.

5. **Biyolojik Sınıflandırma**: Canlıların sınıflandırılması, bir ağaç yapısıyla temsil edilir, kök düğümü tüm canlıları, iç düğümler taksonomi kategorilerini ve yapraklar türleri temsil eder.

Ağaçlar, graf teorisinin en önemli ve en yaygın kullanılan yapılarından biridir ve birçok gerçek dünya problemini modellemek ve çözmek için kullanılır.
