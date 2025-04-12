# 5. Yollar ve Döngüler (Paths and Cycles)

## Yol Kavramı

Bir grafta yol, ardışık kenarlar dizisidir, öyle ki her ardışık kenar çiftinin ortak bir düğümü vardır ve hiçbir düğüm birden fazla kez ziyaret edilmez.

### Formal Tanım

Bir G = (V, E) grafında, v₀, v₁, ..., vₖ düğümleri için bir yol, (v₀, v₁), (v₁, v₂), ..., (vₖ₋₁, vₖ) kenarlarından oluşan bir dizidir, öyle ki:
- Her (vᵢ, vᵢ₊₁) kenarı G'de bulunur.
- Tüm düğümler v₀, v₁, ..., vₖ birbirinden farklıdır.

### Yol Uzunluğu

Bir yolun uzunluğu, yoldaki kenar sayısıdır. Yukarıdaki tanımda, yolun uzunluğu k'dir.

### Yürüyüş (Walk) ve İz (Trail)

Yol kavramıyla ilişkili iki önemli kavram daha vardır:

- **Yürüyüş (Walk)**: Düğümlerin tekrarlanmasına izin verilen bir kenar dizisidir.
- **İz (Trail)**: Kenarların tekrarlanmasına izin verilmeyen, ancak düğümlerin tekrarlanabileceği bir kenar dizisidir.

Yani, her yol bir izdir ve her iz bir yürüyüştür, ancak tersi her zaman doğru değildir.

## Döngü Kavramı

Bir döngü, başlangıç ve bitiş düğümü aynı olan bir yoldur.

### Formal Tanım

Bir G = (V, E) grafında, v₀, v₁, ..., vₖ düğümleri için bir döngü, (v₀, v₁), (v₁, v₂), ..., (vₖ₋₁, vₖ), (vₖ, v₀) kenarlarından oluşan bir dizidir, öyle ki:
- Her (vᵢ, vᵢ₊₁) kenarı ve (vₖ, v₀) kenarı G'de bulunur.
- Tüm düğümler v₀, v₁, ..., vₖ birbirinden farklıdır.

### Döngü Uzunluğu

Bir döngünün uzunluğu, döngüdeki kenar sayısıdır. Yukarıdaki tanımda, döngünün uzunluğu k+1'dir.

### Kapalı Yürüyüş (Closed Walk) ve Kapalı İz (Closed Trail)

Döngü kavramıyla ilişkili iki önemli kavram daha vardır:

- **Kapalı Yürüyüş (Closed Walk)**: Başlangıç ve bitiş düğümü aynı olan bir yürüyüştür.
- **Kapalı İz (Closed Trail)**: Başlangıç ve bitiş düğümü aynı olan bir izdir.

Yani, her döngü bir kapalı izdir ve her kapalı iz bir kapalı yürüyüştür, ancak tersi her zaman doğru değildir.

## Yolların ve Döngülerin Özellikleri

### Yolların Özellikleri

1. **Uzunluk**: Bir yolun uzunluğu, yoldaki kenar sayısıdır.
2. **Basitlik**: Bir yol, tüm düğümleri farklıysa "basit" olarak adlandırılır.
3. **Uç Noktaları**: Bir yolun uç noktaları, yolun ilk ve son düğümleridir.

### Döngülerin Özellikleri

1. **Uzunluk**: Bir döngünün uzunluğu, döngüdeki kenar sayısıdır.
2. **Basitlik**: Bir döngü, başlangıç ve bitiş düğümü dışında tüm düğümleri farklıysa "basit" olarak adlandırılır.
3. **Çift/Tek Uzunluk**: Bir döngünün uzunluğu çift veya tek olabilir. Bu özellik, grafın iki parçalı olup olmadığını belirlemede önemlidir.

## Yol ve Döngü Bulma Algoritmaları

### Derinlik Öncelikli Arama (DFS) ile Yol Bulma

DFS, bir grafta iki düğüm arasında bir yol olup olmadığını belirlemek için kullanılabilir:

```
Algorithm FindPath(G, u, v):
    Mark u as visited
    If u = v:
        Return "Path found"
    For each neighbor w of u:
        If w is unvisited:
            If FindPath(G, w, v) = "Path found":
                Return "Path found"
    Return "No path found"
```

### Genişlik Öncelikli Arama (BFS) ile En Kısa Yol Bulma

BFS, iki düğüm arasındaki en kısa yolu bulmak için kullanılabilir:

```
Algorithm FindShortestPath(G, u, v):
    Mark u as visited
    Initialize a queue Q with u
    Initialize a map parent to track the path
    While Q is not empty:
        Dequeue a vertex w from Q
        If w = v:
            Reconstruct the path using parent map
            Return the path
        For each neighbor x of w:
            If x is unvisited:
                Mark x as visited
                Set parent[x] = w
                Enqueue x to Q
    Return "No path found"
```

### Döngü Tespiti

Bir grafta döngü olup olmadığını belirlemek için DFS kullanılabilir:

```
Algorithm DetectCycle(G):
    Mark all vertices as unvisited
    For each vertex v in G:
        If v is unvisited:
            If DFSCycle(G, v, null) = "Cycle found":
                Return "Cycle found"
    Return "No cycle found"

Algorithm DFSCycle(G, v, parent):
    Mark v as visited
    For each neighbor w of v:
        If w is unvisited:
            If DFSCycle(G, w, v) = "Cycle found":
                Return "Cycle found"
        Else if w != parent:
            Return "Cycle found"
    Return "No cycle found"
```

## Özel Yollar ve Döngüler

### Hamilton Yolu ve Döngüsü

Bir Hamilton yolu, grafın tüm düğümlerini tam olarak bir kez ziyaret eden bir yoldur. Bir Hamilton döngüsü, grafın tüm düğümlerini tam olarak bir kez ziyaret eden ve başlangıç düğümüne dönen bir döngüdür.

#### Hamilton Yolu ve Döngüsü Bulma

Hamilton yolu ve döngüsü bulma problemi NP-zordur, yani büyük graflar için etkili bir algoritma bilinmemektedir. Ancak, küçük graflar için geri izleme (backtracking) gibi yöntemler kullanılabilir.

### Euler Yolu ve Döngüsü

Bir Euler yolu, grafın tüm kenarlarını tam olarak bir kez geçen bir yoldur. Bir Euler döngüsü, grafın tüm kenarlarını tam olarak bir kez geçen ve başlangıç düğümüne dönen bir döngüdür.

#### Euler Yolu ve Döngüsü İçin Gerekli ve Yeterli Koşullar

- Bir bağlantılı grafta Euler döngüsü vardır ancak ve ancak her düğümün derecesi çift ise.
- Bir bağlantılı grafta Euler yolu vardır ancak ve ancak tam olarak iki düğümün derecesi tek ve diğer tüm düğümlerin derecesi çift ise.

#### Euler Yolu ve Döngüsü Bulma

Euler yolu ve döngüsü bulmak için Fleury algoritması kullanılabilir:

```
Algorithm Fleury(G, u):
    Initialize an empty path P
    While u has neighbors:
        Choose an edge (u, v) that is not a bridge if possible
        Add (u, v) to P
        Remove (u, v) from G
        Set u = v
    Return P
```

## Yolların ve Döngülerin Uygulamaları

### En Kısa Yol Problemleri

En kısa yol problemleri, iki düğüm arasındaki en kısa yolu bulmayı amaçlar. Bu problemler, ulaşım ağları, iletişim ağları ve sosyal ağlar gibi birçok alanda uygulanır.

#### Dijkstra Algoritması

Dijkstra algoritması, bir düğümden diğer tüm düğümlere olan en kısa yolları bulmak için kullanılır:

```
Algorithm Dijkstra(G, s):
    Initialize distances d[v] = infinity for all vertices v
    Set d[s] = 0
    Initialize a priority queue Q with all vertices
    While Q is not empty:
        Extract vertex u with minimum d[u] from Q
        For each neighbor v of u:
            If d[u] + weight(u, v) < d[v]:
                Set d[v] = d[u] + weight(u, v)
                Update v's position in Q
    Return distances d
```

#### Bellman-Ford Algoritması

Bellman-Ford algoritması, negatif ağırlıklı kenarları olan graflarda en kısa yolları bulmak için kullanılır:

```
Algorithm BellmanFord(G, s):
    Initialize distances d[v] = infinity for all vertices v
    Set d[s] = 0
    For i = 1 to |V| - 1:
        For each edge (u, v) in G:
            If d[u] + weight(u, v) < d[v]:
                Set d[v] = d[u] + weight(u, v)
    For each edge (u, v) in G:
        If d[u] + weight(u, v) < d[v]:
            Return "Negative cycle detected"
    Return distances d
```

#### Floyd-Warshall Algoritması

Floyd-Warshall algoritması, tüm düğüm çiftleri arasındaki en kısa yolları bulmak için kullanılır:

```
Algorithm FloydWarshall(G):
    Initialize distances d[u][v] = weight(u, v) if (u, v) is an edge, infinity otherwise
    For each vertex k:
        For each vertex u:
            For each vertex v:
                If d[u][k] + d[k][v] < d[u][v]:
                    Set d[u][v] = d[u][k] + d[k][v]
    Return distances d
```

### Gezgin Satıcı Problemi

Gezgin Satıcı Problemi (TSP), bir satıcının tüm şehirleri tam olarak bir kez ziyaret edip başlangıç şehrine dönmesi gereken en kısa turu bulmayı amaçlar. Bu, bir Hamilton döngüsü bulma problemidir.

#### TSP İçin Yaklaşık Algoritmalar

TSP NP-zor olduğundan, büyük örnekler için yaklaşık algoritmalar kullanılır:

1. **En Yakın Komşu Algoritması**: Her adımda, mevcut şehre en yakın henüz ziyaret edilmemiş şehri seçer.
2. **2-Opt Algoritması**: Mevcut turdaki iki kenarı çıkarıp iki yeni kenarla değiştirerek turu iyileştirir.
3. **Genetik Algoritmalar**: Evrimsel süreçleri taklit ederek iyi turlar bulmaya çalışır.

### Euler Turu Problemleri

Euler turu problemleri, bir grafın tüm kenarlarını tam olarak bir kez geçen bir tur bulmayı amaçlar. Bu problemler, posta dağıtımı, kar temizleme ve kablo döşeme gibi uygulamalarda kullanılır.

#### Çinli Postacı Problemi

Çinli Postacı Problemi, bir grafın tüm kenarlarını en az bir kez geçen en kısa turu bulmayı amaçlar. Eğer graf Euler döngüsüne sahipse, problem trivialdir. Aksi takdirde, bazı kenarların birden fazla kez geçilmesi gerekir.

## Yollar, Döngüler ve Diğer Graf Özellikleri

### Yollar ve Bağlantılılık

Bir graf, her düğüm çifti arasında bir yol varsa bağlantılıdır. Yolların varlığı, grafın bağlantılılık özelliklerini belirler.

### Döngüler ve İki Parçalılık

Bir graf, ancak ve ancak tüm döngüleri çift uzunluktaysa iki parçalıdır. Tek uzunlukta bir döngünün varlığı, grafın iki parçalı olmadığını gösterir.

### Yollar, Döngüler ve Ağaçlar

Ağaçlar, döngüsüz bağlantılı graflardır. Bir ağaçta, herhangi iki düğüm arasında tam olarak bir yol vardır.

## Gerçek Hayat Örnekleri

Yollar ve döngüler, günlük hayatta birçok yerde karşımıza çıkar:

1. **GPS Navigasyon**: GPS sistemleri, en kısa yol algoritmalarını kullanarak iki konum arasındaki en kısa yolu bulur.

2. **Ulaşım Planlaması**: Şehir planlamacıları, trafik akışını optimize etmek için yol ağlarını analiz eder.

3. **Tur Planlama**: Turistik yerler arasında en verimli turu planlamak, Gezgin Satıcı Problemi'nin bir uygulamasıdır.

4. **Posta ve Kargo Dağıtımı**: Postacılar ve kargo şirketleri, tüm sokakları veya adresleri en verimli şekilde ziyaret etmek için Euler turu problemlerini çözer.

5. **Sosyal Ağ Analizi**: Sosyal ağlarda, kişiler arasındaki en kısa yollar, sosyal mesafeyi ölçmek için kullanılır.

Yollar ve döngüler, graf teorisinin en temel kavramlarından ikisidir ve birçok gerçek dünya problemini modellemek ve çözmek için kullanılır.
