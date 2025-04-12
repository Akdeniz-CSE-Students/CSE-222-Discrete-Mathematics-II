# 9. Renklendirme Problemleri

## Graf Renklendirme Kavramı

Graf renklendirme, bir grafın düğümlerine veya kenarlarına, belirli kurallara göre renkler atama işlemidir. En yaygın renklendirme problemi, komşu düğümlerin farklı renklere sahip olması gereken düğüm renklendirmedir.

### Düğüm Renklendirme

Bir grafın düğüm renklendirmesi, her düğüme bir renk atanması ve komşu düğümlerin farklı renklere sahip olmasıdır. Bir grafın düğüm renklendirmesi için gereken minimum renk sayısına, o grafın "kromatik sayısı" denir ve χ(G) ile gösterilir.

### Kenar Renklendirme

Bir grafın kenar renklendirmesi, her kenara bir renk atanması ve ortak bir düğümü paylaşan kenarların farklı renklere sahip olmasıdır. Bir grafın kenar renklendirmesi için gereken minimum renk sayısına, o grafın "kenar kromatik sayısı" denir ve χ'(G) ile gösterilir.

### Yüz Renklendirme

Düzlemsel bir grafın yüz renklendirmesi, her yüze bir renk atanması ve ortak bir kenarı paylaşan yüzlerin farklı renklere sahip olmasıdır. Bir düzlemsel grafın yüz renklendirmesi için gereken minimum renk sayısına, o grafın "yüz kromatik sayısı" denir.

## Düğüm Renklendirme Problemleri

### k-Renklendirilebilirlik

Bir graf, eğer düğümleri k veya daha az renkle renklendirilebiliyorsa "k-renklendirilebilir" olarak adlandırılır. Bir grafın k-renklendirilebilir olup olmadığını belirlemek, k ≥ 3 için NP-tam bir problemdir.

### 2-Renklendirilebilirlik ve İki Parçalı Graflar

Bir graf, ancak ve ancak iki parçalı ise 2-renklendirilebilirdir. Bir grafın iki parçalı olup olmadığını belirlemek, BFS veya DFS kullanılarak polinom zamanda yapılabilir.

### Kromatik Sayı İçin Sınırlar

Bir grafın kromatik sayısı için bazı sınırlar vardır:
- χ(G) ≤ Δ(G) + 1, burada Δ(G) grafın maksimum derecesidir (Brooks teoremi).
- χ(G) ≤ ω(G), burada ω(G) grafın en büyük kliğinin boyutudur.
- Düzlemsel bir graf için, χ(G) ≤ 4 (Dört Renk Teoremi).

### Renklendirme Algoritmaları

#### Açgözlü Renklendirme Algoritması

Açgözlü renklendirme algoritması, düğümleri belirli bir sırayla işler ve her düğüme, komşularının renklerini dikkate alarak mümkün olan en küçük renk numarasını atar:

```
Algorithm GreedyColoring(G):
    For each vertex v in G:
        Assign the smallest color number to v that is not used by any of its neighbors
    Return the coloring
```

Bu algoritma, en kötü durumda Δ(G) + 1 renk kullanır, ancak optimal renklendirmeyi garanti etmez.

#### Welsh-Powell Algoritması

Welsh-Powell algoritması, düğümleri derecelerine göre azalan sırada işler:

```
Algorithm WelshPowell(G):
    Sort vertices in decreasing order of degree
    For each vertex v in the sorted order:
        Assign the smallest color number to v that is not used by any of its colored neighbors
    Return the coloring
```

Bu algoritma genellikle açgözlü algoritmadan daha iyi sonuçlar verir, ancak yine de optimal renklendirmeyi garanti etmez.

#### Geri İzleme Algoritması

Geri izleme algoritması, tüm olası renklendirmeleri deneyerek optimal renklendirmeyi bulur:

```
Algorithm BacktrackColoring(G, k, coloring, v):
    If all vertices are colored:
        Return true
    For color c from 1 to k:
        If c is valid for vertex v:
            Assign color c to v
            If BacktrackColoring(G, k, coloring, v+1) is true:
                Return true
            Unassign color from v
    Return false
```

Bu algoritma, optimal renklendirmeyi garanti eder, ancak zaman karmaşıklığı üsteldir.

## Kenar Renklendirme Problemleri

### Kenar Kromatik Sayı

Bir grafın kenar kromatik sayısı χ'(G), Δ(G) ≤ χ'(G) ≤ Δ(G) + 1 sınırları içindedir (Vizing teoremi). Burada Δ(G) grafın maksimum derecesidir.

### Sınıf 1 ve Sınıf 2 Graflar

Vizing teoremi, grafları iki sınıfa ayırır:
- Sınıf 1 graflar: χ'(G) = Δ(G)
- Sınıf 2 graflar: χ'(G) = Δ(G) + 1

Bir grafın hangi sınıfa ait olduğunu belirlemek NP-zor bir problemdir.

### Kenar Renklendirme Algoritmaları

#### Açgözlü Kenar Renklendirme Algoritması

Açgözlü kenar renklendirme algoritması, kenarları belirli bir sırayla işler ve her kenara, komşu kenarların renklerini dikkate alarak mümkün olan en küçük renk numarasını atar.

#### Vizing Algoritması

Vizing algoritması, bir grafın kenarlarını Δ(G) + 1 renkle renklendiren bir algoritmadır. Bu algoritma, kenarları birer birer renklendirir ve gerektiğinde renklendirmeyi yeniden düzenler.

## Yüz Renklendirme Problemleri

### Dört Renk Teoremi

Dört Renk Teoremi, herhangi bir düzlemsel grafın yüzlerinin en fazla dört renkle renklendirilebileceğini belirtir. Bu teorem, 1976 yılında Appel ve Haken tarafından bilgisayar yardımıyla kanıtlanmıştır.

### Beş Renk Teoremi

Beş Renk Teoremi, herhangi bir düzlemsel grafın yüzlerinin en fazla beş renkle renklendirilebileceğini belirtir. Bu teorem, Dört Renk Teoremi'nden daha basit bir şekilde kanıtlanabilir.

### Düğüm-Yüz Dualite

Düzlemsel bir grafın düğüm renklendirmesi ile dual grafının yüz renklendirmesi arasında bir dualite vardır. Bir düzlemsel grafın yüz kromatik sayısı, dual grafının düğüm kromatik sayısına eşittir.

## Renklendirme Uygulamaları

### Harita Renklendirme

Graf renklendirmenin en klasik uygulaması, harita renklendirmedir. Bir haritada, ortak sınırı olan bölgelerin farklı renklerle boyanması gerekir. Bu problem, düzlemsel bir grafın düğüm renklendirme problemi olarak modellenebilir.

### Zamanlama Problemleri

Zamanlama problemleri, graf renklendirme kullanılarak çözülebilir. Örneğin, sınav programı oluşturma probleminde, dersler düğümleri, aynı öğrencilerin aldığı dersler arasındaki çakışmalar kenarları temsil eder. Renklendirme, çakışmayan derslerin aynı zaman diliminde programlanabileceği anlamına gelir.

### Frekans Atama

Radyo veya hücresel ağlarda, yakın vericilere farklı frekanslar atanmalıdır. Bu problem, vericilerin düğümleri, yakın vericiler arasındaki potansiyel girişimlerin kenarları temsil ettiği bir grafın renklendirme problemi olarak modellenebilir.

### Register Atama

Bilgisayar programlarında, aynı anda kullanılan değişkenlere farklı registerlar atanmalıdır. Bu problem, değişkenlerin düğümleri, aynı anda kullanılan değişkenler arasındaki çakışmaların kenarları temsil ettiği bir grafın renklendirme problemi olarak modellenebilir.

## Özel Grafların Kromatik Sayıları

### Tam Graflar

Tam bir graf Kn'nin kromatik sayısı n'dir, çünkü her düğüm diğer tüm düğümlerle komşudur.

### Çift Parçalı Graflar

Boş olmayan bir çift parçalı grafın kromatik sayısı 2'dir.

### Döngüler

Bir döngü Cn'nin kromatik sayısı, n çift ise 2, n tek ise 3'tür.

### Tekerlekler

Bir tekerlek Wn'nin kromatik sayısı, n çift ise 3, n tek ise 4'tür.

### Düzlemsel Graflar

Düzlemsel bir grafın kromatik sayısı en fazla 4'tür (Dört Renk Teoremi).

## Renklendirme Varyasyonları

### Liste Renklendirme

Liste renklendirme, her düğüme bir renk listesi verildiğinde, her düğümün kendi listesinden bir renk seçmesi ve komşu düğümlerin farklı renkler seçmesi gereken bir problemdir.

### Toplam Renklendirme

Toplam renklendirme, hem düğümlerin hem de kenarların renklendirildiği ve bitişik veya komşu elemanların farklı renklere sahip olması gereken bir problemdir.

### Harmonik Renklendirme

Harmonik renklendirme, her renk sınıfının bir bağımsız küme oluşturduğu ve her düğümün komşularının tüm diğer renkleri içerdiği bir renklendirmedir.

### Acyclic Renklendirme

Acyclic renklendirme, her renk sınıfının bir bağımsız küme oluşturduğu ve herhangi iki renk sınıfının birleşiminin döngüsüz bir alt graf oluşturduğu bir renklendirmedir.

## Gerçek Hayat Örnekleri

Graf renklendirme problemleri, günlük hayatta birçok yerde karşımıza çıkar:

1. **Harita Renklendirme**: Ülke, eyalet veya bölge haritalarında, komşu bölgelerin farklı renklerle boyanması.

2. **Sınav Programı**: Üniversitelerde, aynı öğrencilerin aldığı derslerin farklı zaman dilimlerinde programlanması.

3. **Frekans Atama**: Radyo istasyonlarına, televizyon kanallarına veya hücresel ağlardaki baz istasyonlarına frekans atanması.

4. **Spor Turnuvaları**: Takımların maç programının, çakışmaları önleyecek şekilde düzenlenmesi.

5. **Depolama Atama**: Birbiriyle reaksiyona girebilecek kimyasalların farklı depolama alanlarına atanması.

Graf renklendirme, graf teorisinin en ilginç ve en yaygın kullanılan konularından biridir ve birçok gerçek dünya problemini modellemek ve çözmek için kullanılır.
