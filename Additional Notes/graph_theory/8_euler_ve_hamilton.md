# 8. Euler ve Hamilton Grafları

## Euler Yolları ve Döngüleri

### Euler Yolu Kavramı

Bir Euler yolu, bir graftaki her kenarı tam olarak bir kez geçen bir yoldur. Başka bir deyişle, bir Euler yolu, grafın tüm kenarlarını dolaşan ancak aynı kenardan iki kez geçmeyen bir yoldur.

### Euler Döngüsü Kavramı

Bir Euler döngüsü, bir Euler yoludur ve aynı zamanda başlangıç düğümüne geri döner. Yani, bir Euler döngüsü, grafın tüm kenarlarını tam olarak bir kez geçen ve başladığı düğüme dönen kapalı bir yoldur.

### Euler Yolu ve Döngüsü İçin Gerekli ve Yeterli Koşullar

#### Yönsüz Graflar İçin

**Euler Yolu İçin**: Bir yönsüz grafta Euler yolu vardır ancak ve ancak:
1. Graf bağlantılıdır (tek düğüm hariç).
2. Grafta tam olarak iki düğümün derecesi tek sayıdır (bu düğümler Euler yolunun başlangıç ve bitiş düğümleridir) veya tüm düğümlerin derecesi çift sayıdır (bu durumda Euler yolu aynı zamanda bir Euler döngüsüdür).

**Euler Döngüsü İçin**: Bir yönsüz grafta Euler döngüsü vardır ancak ve ancak:
1. Graf bağlantılıdır (tek düğüm hariç).
2. Tüm düğümlerin derecesi çift sayıdır.

#### Yönlü Graflar İçin

**Euler Yolu İçin**: Bir yönlü grafta Euler yolu vardır ancak ve ancak:
1. Graf zayıf bağlantılıdır.
2. En fazla bir düğümün çıkış derecesi, giriş derecesinden bir fazladır (bu düğüm Euler yolunun başlangıç düğümüdür).
3. En fazla bir düğümün giriş derecesi, çıkış derecesinden bir fazladır (bu düğüm Euler yolunun bitiş düğümüdür).
4. Diğer tüm düğümlerin giriş derecesi çıkış derecesine eşittir.

**Euler Döngüsü İçin**: Bir yönlü grafta Euler döngüsü vardır ancak ve ancak:
1. Graf güçlü bağlantılıdır.
2. Her düğümün giriş derecesi çıkış derecesine eşittir.

### Euler Yolu ve Döngüsü Bulma Algoritmaları

#### Fleury Algoritması

Fleury algoritması, bir grafta Euler yolu veya döngüsü bulmak için kullanılan klasik bir algoritmadır:

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

Fleury algoritması, her adımda köprü olmayan bir kenar seçmeye çalışır. Köprü, çıkarıldığında grafın bağlantılılığını bozan bir kenardır.

#### Hierholzer Algoritması

Hierholzer algoritması, Euler yolu veya döngüsü bulmak için daha verimli bir algoritmadır:

```
Algorithm Hierholzer(G, u):
    Initialize an empty stack S and an empty path P
    Push u onto S
    While S is not empty:
        Let v be the top vertex of S
        If v has no neighbors:
            Pop v from S
            Add v to the beginning of P
        Else:
            Choose a neighbor w of v
            Push w onto S
            Remove the edge (v, w) from G
    Return P
```

Hierholzer algoritması, O(|E|) zaman karmaşıklığına sahiptir, burada |E| kenar sayısıdır.

### Euler Yolu ve Döngüsü Uygulamaları

#### Königsberg Köprüleri Problemi

Euler yolu ve döngüsü kavramı, Königsberg Köprüleri Problemi'nden doğmuştur. Bu problem, Königsberg şehrindeki yedi köprünün her birinden tam olarak bir kez geçerek şehri dolaşmanın mümkün olup olmadığını sorgular. Euler, bu problemin çözülemez olduğunu göstermiştir, çünkü şehrin dört bölgesinin hepsinin tek dereceli olduğunu ve bir Euler yolu veya döngüsü için en fazla iki düğümün tek dereceli olması gerektiğini kanıtlamıştır.

#### Çinli Postacı Problemi

Çinli Postacı Problemi, bir postacının tüm sokakları en az bir kez geçerek başladığı noktaya dönmesi gereken en kısa rotayı bulmayı amaçlar. Eğer graf Euler döngüsüne sahipse, problem trivialdir. Aksi takdirde, bazı kenarların birden fazla kez geçilmesi gerekir.

#### Devre Tasarımı

Euler yolları, elektronik devrelerde tek kullanımlık yollar tasarlamak için kullanılabilir.

## Hamilton Yolları ve Döngüleri

### Hamilton Yolu Kavramı

Bir Hamilton yolu, bir graftaki her düğümü tam olarak bir kez ziyaret eden bir yoldur. Başka bir deyişle, bir Hamilton yolu, grafın tüm düğümlerini dolaşan ancak aynı düğümden iki kez geçmeyen bir yoldur.

### Hamilton Döngüsü Kavramı

Bir Hamilton döngüsü, bir Hamilton yoludur ve aynı zamanda başlangıç düğümüne geri döner. Yani, bir Hamilton döngüsü, grafın tüm düğümlerini tam olarak bir kez ziyaret eden ve başladığı düğüme dönen kapalı bir yoldur.

### Hamilton Yolu ve Döngüsü İçin Yeterli Koşullar

Hamilton yolu ve döngüsü için Euler yolu ve döngüsü gibi basit gerekli ve yeterli koşullar yoktur. Ancak, bazı yeterli koşullar vardır:

#### Dirac Teoremi

Eğer n ≥ 3 düğümlü bir grafta her düğümün derecesi en az n/2 ise, graf bir Hamilton döngüsüne sahiptir.

#### Ore Teoremi

Eğer n ≥ 3 düğümlü bir grafta, komşu olmayan herhangi iki düğümün derecelerinin toplamı en az n ise, graf bir Hamilton döngüsüne sahiptir.

### Hamilton Yolu ve Döngüsü Bulma Algoritmaları

Hamilton yolu ve döngüsü bulma problemi NP-zordur, yani büyük graflar için etkili bir algoritma bilinmemektedir. Ancak, küçük graflar için geri izleme (backtracking) gibi yöntemler kullanılabilir:

```
Algorithm HamiltonianPath(G, path, visited, v):
    Add v to path
    Mark v as visited
    If path includes all vertices:
        Return true
    For each neighbor w of v:
        If w is not visited:
            If HamiltonianPath(G, path, visited, w) is true:
                Return true
    Remove v from path
    Mark v as unvisited
    Return false
```

### Hamilton Yolu ve Döngüsü Uygulamaları

#### Gezgin Satıcı Problemi

Gezgin Satıcı Problemi (TSP), bir satıcının tüm şehirleri tam olarak bir kez ziyaret edip başlangıç şehrine dönmesi gereken en kısa turu bulmayı amaçlar. Bu, bir Hamilton döngüsü bulma problemidir.

#### İcosian Oyunu

Hamilton, bir dodecahedron'un köşelerini dolaşan bir oyun tasarlamıştır. Bu oyun, bir Hamilton döngüsü bulma problemidir.

#### Devre Tasarımı

Hamilton yolları, elektronik devrelerde her bileşeni tam olarak bir kez ziyaret eden yollar tasarlamak için kullanılabilir.

## Euler ve Hamilton Grafları Arasındaki Farklar

### Tanım Farkları

- Euler yolu/döngüsü, grafın tüm **kenarlarını** tam olarak bir kez geçer.
- Hamilton yolu/döngüsü, grafın tüm **düğümlerini** tam olarak bir kez ziyaret eder.

### Karmaşıklık Farkları

- Euler yolu/döngüsü varlığını kontrol etmek ve bulmak polinom zamanda yapılabilir (O(|E|)).
- Hamilton yolu/döngüsü varlığını kontrol etmek NP-tam bir problemdir ve büyük graflar için etkili bir algoritma bilinmemektedir.

### Koşul Farkları

- Euler yolu/döngüsü için basit gerekli ve yeterli koşullar vardır (düğümlerin derecelerine bağlı).
- Hamilton yolu/döngüsü için basit gerekli ve yeterli koşullar yoktur, sadece bazı yeterli koşullar vardır.

## Özel Graflar ve Euler/Hamilton Özellikleri

### Tam Graflar

Tam bir graf Kn (n ≥ 3), her zaman bir Hamilton döngüsüne sahiptir. Ayrıca, n çift ise, Kn bir Euler döngüsüne de sahiptir.

### Çift Parçalı Graflar

Tam çift parçalı bir graf Km,n, m = n ise bir Hamilton döngüsüne sahiptir. Ayrıca, m ve n çift ise, Km,n bir Euler döngüsüne de sahiptir.

### Petersen Grafı

Petersen grafı, bir Hamilton döngüsüne sahip değildir, ancak bir Hamilton yoluna sahiptir. Ayrıca, tüm düğümleri 3-dereceli olduğundan, bir Euler yolu veya döngüsüne sahip değildir.

## Gerçek Hayat Uygulamaları

Euler ve Hamilton grafları, günlük hayatta birçok yerde karşımıza çıkar:

1. **Rota Planlama**: Posta dağıtımı, çöp toplama, kar temizleme gibi hizmetlerde, tüm sokakları en verimli şekilde dolaşmak için Euler yolları kullanılır.

2. **Tur Planlama**: Turistik yerler arasında en verimli turu planlamak için Hamilton yolları kullanılır.

3. **Devre Tasarımı**: Elektronik devrelerde, bileşenler arasındaki bağlantıları optimize etmek için Euler ve Hamilton yolları kullanılır.

4. **Oyun Tasarımı**: Bulmaca oyunlarında, tüm noktaları veya çizgileri bir kez geçme görevi için Euler ve Hamilton yolları kullanılır.

5. **Genetik Dizileme**: DNA dizilerini yeniden yapılandırmak için Euler ve Hamilton yolları kullanılır.

Euler ve Hamilton grafları, graf teorisinin en klasik ve en ilginç konularından ikisidir ve birçok gerçek dünya problemini modellemek ve çözmek için kullanılır.
