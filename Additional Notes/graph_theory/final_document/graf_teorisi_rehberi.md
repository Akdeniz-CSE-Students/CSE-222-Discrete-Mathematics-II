# GRAF TEORİSİ KAPSAMLI REHBER

## İçindekiler

1. [Graf Teorisine Giriş ve Tarihçe](#1-graf-teorisine-giriş-ve-tarihçe)
2. [Temel Kavramlar ve Tanımlar](#2-temel-kavramlar-ve-tanımlar)
3. [Graf Türleri ve Özellikleri](#3-graf-türleri-ve-özellikleri)
4. [Bağlantılılık](#4-bağlantılılık)
5. [Yollar ve Döngüler](#5-yollar-ve-döngüler)
6. [Ağaçlar](#6-ağaçlar)
7. [Ağlar ve Akışlar](#7-ağlar-ve-akışlar)
8. [Euler ve Hamilton Grafları](#8-euler-ve-hamilton-grafları)
9. [Renklendirme Problemleri](#9-renklendirme-problemleri)
10. [Karmaşıklık Konuları](#10-karmaşıklık-konuları)
11. [Örnek Problemler ve Çözümler](#11-örnek-problemler-ve-çözümler)
# 1. Graf Teorisine Giriş ve Tarihçe

## Graf Teorisinin Doğuşu

Graf teorisi, matematiğin en eski ve en temel alanlarından biridir. Bu alanın doğuşu, 18. yüzyılda yaşamış ünlü matematikçi Leonhard Euler'in çözdüğü meşhur Königsberg Köprüleri Problemi'ne dayanır.

### Königsberg Köprüleri Problemi

Königsberg (günümüzde Kaliningrad, Rusya), Pregel Nehri üzerinde kurulmuş bir şehirdi. Şehir, nehrin iki yakasında ve nehrin ortasındaki iki adada yer alıyordu. Bu dört kara parçası, toplam yedi köprü ile birbirine bağlanmıştı. Şehir sakinleri arasında popüler bir soru vardı: "Acaba bir kişi, her köprüden tam olarak bir kez geçerek ve başladığı noktaya geri dönerek şehri dolaşabilir miydi?"

1736 yılında Euler, bu problemi matematiksel olarak ele aldı. Euler, problemi çözmek için şehrin haritasını basitleştirdi: Kara parçalarını noktalar (düğümler) ve köprüleri çizgiler (kenarlar) olarak temsil etti. Böylece ortaya çıkan yapı, günümüzde "graf" olarak adlandırdığımız matematiksel nesnenin ilk örneği oldu.

Euler, her düğümün derecesini (o düğüme bağlı kenar sayısını) inceledi ve şu sonuca vardı: Eğer bir grafta, her düğümün derecesi çift sayı ise, o zaman her kenardan tam olarak bir kez geçen ve başlangıç noktasına dönen bir yol (Euler turu) vardır. Eğer tam olarak iki düğümün derecesi tek sayı ise, o zaman her kenardan tam olarak bir kez geçen bir yol (Euler yolu) vardır, ancak bu yol başlangıç noktasına dönmez.

Königsberg'in durumunda, tüm düğümlerin dereceleri tek sayıydı, bu nedenle Euler, böyle bir yolun imkansız olduğunu matematiksel olarak kanıtladı.

### Hamilton Yolları

Graf teorisinin bir diğer önemli gelişmesi, Sir William Rowan Hamilton (1805-1865) tarafından gerçekleştirildi. Hamilton, 1859 yılında bir oyun geliştirdi. Bu oyunda amaç, bir grafın tüm düğümlerini tam olarak bir kez ziyaret eden bir yol bulmaktı. Bu tür yollara bugün "Hamilton yolları" diyoruz.

Hamilton, bu oyunu Dublin'deki bir oyuncak üreticisine sattı, ancak oyun hiçbir zaman büyük bir başarı elde edemedi. Bununla birlikte, Hamilton'un çalışmaları, graf teorisinin gelişimine önemli katkılar sağladı.

## Graf Teorisinin Modern Uygulamaları

Günümüzde graf teorisi, bilgisayar bilimi, fizik, kimya, biyoloji, sosyoloji, ekonomi ve daha birçok alanda yaygın olarak kullanılmaktadır. İşte graf teorisinin bazı modern uygulamaları:

### Ağ Analizi

Graf teorisi, sosyal ağlar, bilgisayar ağları, ulaşım ağları ve biyolojik ağlar gibi çeşitli ağların analizinde kullanılır. Örneğin, sosyal medya platformlarında, kullanıcılar düğümler ve aralarındaki ilişkiler kenarlar olarak temsil edilebilir. Bu temsil, toplulukların tespiti, etki analizi ve bilgi yayılımı gibi konuların incelenmesine olanak tanır.

### Yol Bulma Algoritmaları

GPS sistemleri, en kısa yolu bulmak için graf teorisi algoritmalarını kullanır. Şehirler veya kavşaklar düğümler, yollar ise kenarlar olarak temsil edilir. Dijkstra algoritması gibi algoritmalar, iki nokta arasındaki en kısa yolu bulmak için kullanılır.

### Web Sayfalarının Sıralanması

Google gibi arama motorları, web sayfalarını sıralamak için graf teorisi kullanır. PageRank algoritması, web sayfalarını düğümler ve sayfalar arasındaki bağlantıları kenarlar olarak temsil eden bir graf üzerinde çalışır.

### Kimyasal Bileşiklerin Modellenmesi

Kimyada, moleküller graflar olarak temsil edilebilir. Atomlar düğümler, kimyasal bağlar ise kenarlar olarak düşünülebilir. Bu temsil, moleküllerin özelliklerinin anlaşılmasına ve yeni moleküllerin tasarlanmasına yardımcı olur.

### Bilgisayar Ağları

Bilgisayar ağlarında, veri merkezleri düğümler ve iletişim bağlantıları kenarlar olarak temsil edilebilir. Bu temsil, ağ tasarımı, trafik yönetimi ve güvenlik analizi gibi konularda kullanılır.

## Graf Teorisinin Önemi

Graf teorisi, karmaşık sistemleri basit ve sezgisel bir şekilde temsil etmemize olanak tanır. Graflar, gerçek dünyadaki birçok problemi modellemek için kullanılabilir ve bu modeller üzerinde çeşitli algoritmalar çalıştırılabilir.

Graf teorisi, ayrıca, diğer matematiksel alanlarla da yakından ilişkilidir. Örneğin, lineer cebir, olasılık teorisi, topoloji ve kombinatorik gibi alanlarla bağlantıları vardır.

Sonuç olarak, graf teorisi, hem teorik hem de uygulamalı matematiğin önemli bir dalıdır ve günlük hayatımızda karşılaştığımız birçok problemi çözmek için kullanılır.
# 2. Temel Kavramlar ve Tanımlar

## Graf Nedir?

Bir graf G = (V, E), iki kümenin bir çiftidir: V boş olmayan bir düğümler (veya tepe noktaları) kümesi ve E kenarlar kümesidir. Her kenar, bir veya iki düğümle ilişkilendirilir ve bu düğümlere kenarın uç noktaları denir. Bir kenar, uç noktalarını birbirine bağlar.

Graflar genellikle görsel olarak temsil edilir: düğümler noktalar olarak, kenarlar ise bu noktaları birleştiren çizgiler olarak gösterilir. Graflar, gerçek dünyadaki birçok ilişkiyi modellemek için kullanılabilir.

### Formal Tanım

Matematiksel olarak, bir graf G = (V, E) şu şekilde tanımlanır:
- V, boş olmayan bir düğümler kümesidir.
- E, kenarlar kümesidir. Her kenar e ∈ E, V kümesinden bir veya iki düğümle ilişkilendirilir.

Eğer bir kenar e, v₁ ve v₂ düğümlerini bağlıyorsa, e = (v₁, v₂) olarak gösterilir ve e kenarının v₁ ve v₂ düğümleriyle "bitişik" olduğu söylenir.

## Temel Terminoloji

### Düğüm (Vertex/Node)

Bir grafın temel yapı taşıdır. Düğümler, grafın temsil ettiği sistemdeki nesneleri veya varlıkları temsil eder. Örneğin, bir sosyal ağ grafında, düğümler insanları temsil edebilir.

### Kenar (Edge)

İki düğüm arasındaki bağlantıyı temsil eder. Kenarlar, grafın temsil ettiği sistemdeki ilişkileri veya bağlantıları gösterir. Örneğin, bir sosyal ağ grafında, kenarlar arkadaşlık ilişkilerini temsil edebilir.

### Derece (Degree)

Bir düğümün derecesi, o düğüme bağlı kenarların sayısıdır. Bir v düğümünün derecesi d(v) olarak gösterilir.

Örneğin, aşağıdaki grafta:
- d(v₁) = 2 (v₁ düğümü iki kenara bağlıdır)
- d(v₂) = 3 (v₂ düğümü üç kenara bağlıdır)
- d(v₃) = 1 (v₃ düğümü bir kenara bağlıdır)

### Komşuluk (Adjacency)

İki düğüm, bir kenarla bağlanmışsa, bu düğümlerin "komşu" olduğu söylenir. Benzer şekilde, iki kenar aynı düğümü paylaşıyorsa, bu kenarların "komşu" olduğu söylenir.

### Yol (Path)

Bir grafta bir yol, ardışık kenarlar dizisidir, öyle ki her ardışık kenar çiftinin ortak bir düğümü vardır ve hiçbir düğüm birden fazla kez ziyaret edilmez.

### Döngü (Cycle)

Bir döngü, başlangıç ve bitiş düğümü aynı olan bir yoldur.

## Önemli Özellikler

### Dereceler Toplamı Teoremi

Bir graftaki tüm düğümlerin derecelerinin toplamı, kenar sayısının iki katına eşittir:

$$\sum_{v \in V} d(v) = 2|E|$$

Bu teorem, her kenarın iki düğümü bağladığı ve dolayısıyla iki düğümün derecesine katkıda bulunduğu gerçeğinden kaynaklanır.

### Tek Dereceli Düğüm Sayısı

Bir grafta tek dereceli düğümlerin sayısı her zaman çifttir. Bu, dereceler toplamı teoreminin bir sonucudur, çünkü dereceler toplamı çift bir sayı olmalıdır (2|E|).

## Graf Türleri

### Basit Graf

Basit graf, öz-döngüsü (bir düğümü kendisine bağlayan kenar) ve çoklu kenarı (aynı düğüm çiftini bağlayan birden fazla kenar) olmayan bir graftır.

### Yönlü Graf (Digraph)

Yönlü grafta, kenarlar bir yöne sahiptir. Bir kenar e = (v₁, v₂), v₁'den v₂'ye doğru bir yönü gösterir. Yönlü graflarda, bir düğümün giriş derecesi (in-degree) ve çıkış derecesi (out-degree) vardır.

### Ağırlıklı Graf

Ağırlıklı grafta, her kenara bir ağırlık (veya maliyet) atanır. Bu ağırlıklar, mesafe, zaman, maliyet gibi çeşitli şeyleri temsil edebilir.

### Tam Graf

Tam graf, her düğüm çiftinin bir kenarla bağlandığı bir graftır. n düğümlü bir tam graf, Kₙ olarak gösterilir ve n(n-1)/2 kenara sahiptir.

### İki Parçalı Graf (Bipartite Graph)

İki parçalı graf, düğümleri iki ayrık kümeye ayırabileceğimiz bir graftır, öyle ki her kenar bir kümedeki bir düğümü diğer kümedeki bir düğüme bağlar. Bir grafın iki parçalı olması için gerekli ve yeterli koşul, tek uzunlukta döngüsünün olmamasıdır.

### Tam İki Parçalı Graf

Tam iki parçalı graf, iki ayrık düğüm kümesi arasındaki tüm olası kenarları içeren bir graftır. m ve n düğümlü iki küme için tam iki parçalı graf, Kₘ,ₙ olarak gösterilir ve m×n kenara sahiptir.

### Düzenli Graf

Düzenli graf, tüm düğümlerinin aynı dereceye sahip olduğu bir graftır. Eğer tüm düğümler k derecesine sahipse, graf k-düzenli olarak adlandırılır.

## Grafların Temsili

Graflar, çeşitli şekillerde temsil edilebilir. En yaygın temsil yöntemleri şunlardır:

### Komşuluk Matrisi (Adjacency Matrix)

Komşuluk matrisi, bir grafı temsil etmek için kullanılan kare bir matristir. n düğümlü bir graf için, komşuluk matrisi n×n boyutundadır. Matrisin (i,j) elemanı, i ve j düğümleri arasında bir kenar varsa 1, yoksa 0'dır.

Örneğin, aşağıdaki graf için komşuluk matrisi:

```
  | v₁ v₂ v₃
--+--------
v₁| 0  1  1
v₂| 1  0  1
v₃| 1  1  0
```

### Komşuluk Listesi (Adjacency List)

Komşuluk listesi, her düğüm için o düğüme komşu olan düğümlerin bir listesini tutar. Bu temsil, özellikle seyrek graflar (kenar sayısı düğüm sayısının karesinden çok daha az olan graflar) için etkilidir.

Örneğin, aşağıdaki graf için komşuluk listesi:

```
v₁: v₂, v₃
v₂: v₁, v₃
v₃: v₁, v₂
```

### İlişki Matrisi (Incidence Matrix)

İlişki matrisi, düğümler ve kenarlar arasındaki ilişkiyi gösteren bir matristir. n düğümlü ve m kenarlı bir graf için, ilişki matrisi n×m boyutundadır. Matrisin (i,j) elemanı, i düğümü j kenarının bir uç noktasıysa 1, değilse 0'dır.

Yönlü graflarda, ilişki matrisi biraz farklıdır: eğer i düğümü j kenarının başlangıç noktasıysa -1, bitiş noktasıysa 1, hiçbiri değilse 0'dır.

## Grafların Özellikleri

### Bağlantılılık (Connectivity)

Bir graf, herhangi iki düğüm arasında bir yol varsa "bağlantılı" olarak adlandırılır. Eğer bir graf bağlantılı değilse, bağlantılı alt graflarına "bileşenler" denir.

### İzomorfizm (Isomorphism)

İki graf, düğümleri arasında birebir ve örten bir eşleme varsa ve bu eşleme kenar ilişkilerini koruyorsa "izomorf" olarak adlandırılır. İzomorf graflar, esasen aynı yapıya sahiptir, sadece düğümlerin etiketleri farklıdır.

### Düzlemsellik (Planarity)

Bir graf, kenarları kesişmeden bir düzlemde çizilebiliyorsa "düzlemsel" olarak adlandırılır. Kuratowski teoremi, bir grafın düzlemsel olması için gerekli ve yeterli koşulu verir.

## Grafların Uygulamaları

Graflar, gerçek dünyadaki birçok problemi modellemek için kullanılabilir:

1. **Sosyal Ağlar**: İnsanlar düğümler, arkadaşlık ilişkileri kenarlar olarak temsil edilir.
2. **Bilgisayar Ağları**: Bilgisayarlar düğümler, ağ bağlantıları kenarlar olarak temsil edilir.
3. **Ulaşım Ağları**: Şehirler düğümler, yollar kenarlar olarak temsil edilir.
4. **Kimyasal Bileşikler**: Atomlar düğümler, kimyasal bağlar kenarlar olarak temsil edilir.
5. **Web Sayfaları**: Web sayfaları düğümler, hyperlink bağlantıları kenarlar olarak temsil edilir.

Graflar, bu tür problemleri modellemek için güçlü bir araçtır ve graf teorisi algoritmaları, bu modeller üzerinde çeşitli hesaplamalar yapmak için kullanılır.
# 3. Graf Türleri ve Özellikleri

## Basit Graflar

Basit graf, öz-döngüsü (self-loop) ve çoklu kenarı (multiple edge) olmayan bir graftır. Yani, bir düğümün kendisine bağlantısı yoktur ve herhangi iki düğüm arasında en fazla bir kenar bulunur.

### Özellikleri

- n düğümlü bir basit grafta en fazla n(n-1)/2 kenar olabilir.
- Basit graflar, matematiksel analizler için en temel graf türüdür.
- Gerçek hayatta, birçok ilişki ağı basit graf olarak modellenebilir.

### Örnek

Sosyal bir ağda, kişiler düğümleri ve arkadaşlık ilişkileri kenarları temsil edebilir. Bir kişi kendisiyle arkadaş olamayacağı için öz-döngü yoktur ve iki kişi arasında ya arkadaşlık vardır ya da yoktur (çoklu kenar yoktur).

## Tam Graflar

Tam graf (Complete Graph), her düğüm çiftinin bir kenarla bağlandığı bir graftır. n düğümlü bir tam graf, Kₙ olarak gösterilir.

### Özellikleri

- Kₙ grafında tam olarak n(n-1)/2 kenar vardır.
- Kₙ grafında her düğümün derecesi (n-1)'dir, yani her düğüm diğer tüm düğümlere bağlıdır.
- Tam graflar (n-1)-düzenlidir.

### Örnek

Beş kişilik bir grup düşünün. Eğer gruptaki her kişi diğer tüm kişilerle tanışıyorsa, bu ilişki ağı K₅ tam grafı ile temsil edilebilir.

## İki Parçalı Graflar (Bipartite Graphs)

İki parçalı graf, düğümleri iki ayrık kümeye (V₁ ve V₂) ayırabileceğimiz bir graftır, öyle ki her kenar bir kümedeki bir düğümü diğer kümedeki bir düğüme bağlar. Yani, aynı küme içindeki düğümler arasında kenar yoktur.

### Özellikleri

- Bir grafın iki parçalı olması için gerekli ve yeterli koşul, tek uzunlukta döngüsünün olmamasıdır.
- İki parçalı graflar genellikle siyah-beyaz düğümlerle gösterilir.
- n₁ ve n₂ düğümlü iki küme için, maksimum kenar sayısı n₁×n₂'dir.

### Tam İki Parçalı Graflar

Tam iki parçalı graf (Complete Bipartite Graph), iki ayrık düğüm kümesi arasındaki tüm olası kenarları içeren bir graftır. m ve n düğümlü iki küme için tam iki parçalı graf, Kₘ,ₙ olarak gösterilir.

#### Özellikleri

- Kₘ,ₙ grafında tam olarak m×n kenar vardır.
- V₁ kümesindeki her düğümün derecesi n, V₂ kümesindeki her düğümün derecesi m'dir.
- Kₘ,ₙ grafı, m=n olduğunda düzenlidir.

### Örnek

İş başvuruları düşünün: bir tarafta iş arayanlar, diğer tarafta şirketler var. Her iş arayan birden fazla şirkete başvurabilir ve her şirket birden fazla başvuru alabilir. Bu ilişki ağı, iki parçalı bir graf olarak modellenebilir.

## Düzenli Graflar

Düzenli graf (Regular Graph), tüm düğümlerinin aynı dereceye sahip olduğu bir graftır. Eğer tüm düğümler k derecesine sahipse, graf k-düzenli olarak adlandırılır.

### Özellikleri

- n düğümlü k-düzenli bir grafta, toplam kenar sayısı nk/2'dir.
- Tam graf Kₙ, (n-1)-düzenlidir.
- Çember graf Cₙ, 2-düzenlidir.

### Örnek

Futbol turnuvasında, her takım diğer tüm takımlarla bir kez karşılaşırsa, bu turnuva (n-1)-düzenli bir graf olarak modellenebilir.

## Yönlü Graflar (Directed Graphs)

Yönlü graf veya digraf, kenarların bir yöne sahip olduğu bir graftır. Bir kenar e = (v₁, v₂), v₁'den v₂'ye doğru bir yönü gösterir.

### Özellikleri

- Yönlü graflarda, bir düğümün giriş derecesi (in-degree) ve çıkış derecesi (out-degree) vardır.
- Giriş derecesi, düğüme gelen kenarların sayısıdır.
- Çıkış derecesi, düğümden çıkan kenarların sayısıdır.
- Bir yönlü grafta, tüm düğümlerin giriş dereceleri toplamı = çıkış dereceleri toplamı = kenar sayısıdır.

### Dengeli Yönlü Graflar

Bir yönlü graf, her düğümün giriş derecesi çıkış derecesine eşitse "dengeli" (balanced) olarak adlandırılır.

### Topolojik Sıralama

Yönlü asiklik graflarda (DAG - Directed Acyclic Graph), düğümleri öyle bir sıralayabiliriz ki, her kenar daha düşük indeksli bir düğümden daha yüksek indeksli bir düğüme gider. Bu sıralamaya "topolojik sıralama" denir.

#### Özellikleri

- Bir yönlü grafın topolojik sıralaması varsa ve yalnızca graf asiklikse (döngüsüzse) vardır.
- Topolojik sıralama, birçok gerçek dünya probleminde kullanılır, örneğin görev planlaması.

### Örnek

Web sayfaları arasındaki bağlantılar yönlüdür: A sayfasından B sayfasına bir bağlantı olabilir, ancak B'den A'ya olmayabilir. Bu ilişki ağı, yönlü bir graf olarak modellenebilir.

## Ağırlıklı Graflar (Weighted Graphs)

Ağırlıklı grafta, her kenara bir ağırlık (veya maliyet) atanır. Bu ağırlıklar, mesafe, zaman, maliyet gibi çeşitli şeyleri temsil edebilir.

### Özellikleri

- Ağırlıklı graflarda, yolların uzunluğu kenar sayısı yerine kenar ağırlıklarının toplamı olarak hesaplanır.
- En kısa yol problemleri, ağırlıklı graflarda daha karmaşıktır ve Dijkstra algoritması gibi özel algoritmalar gerektirir.

### Örnek

Şehirler arası yol ağı, ağırlıklı bir graf olarak modellenebilir. Şehirler düğümleri, yollar kenarları ve mesafeler kenar ağırlıklarını temsil eder.

## Çizge Graflar (Line Graphs)

Bir G grafının çizge grafı L(G), G'nin kenarlarını düğüm olarak alan ve G'de komşu olan kenarları L(G)'de kenarlarla bağlayan bir graftır.

### Özellikleri

- G grafında m kenar varsa, L(G) grafında m düğüm vardır.
- G'de bitişik olan her kenar çifti, L(G)'de bir kenarla bağlanır.

### Örnek

Bir ulaşım ağında, kavşaklar düğümleri ve yollar kenarları temsil ediyorsa, bu ağın çizge grafında yollar düğümleri ve kavşaklar kenarları temsil eder.

## Düzlemsel Graflar (Planar Graphs)

Bir graf, kenarları kesişmeden bir düzlemde çizilebiliyorsa "düzlemsel" olarak adlandırılır.

### Özellikleri

- Euler formülü: Düzlemsel bir grafta, v (düğüm sayısı) - e (kenar sayısı) + f (yüz sayısı) = 2.
- Düzlemsel bir grafta, kenar sayısı en fazla 3v - 6'dır (v ≥ 3 için).
- K₅ (5 düğümlü tam graf) ve K₃,₃ (3,3 tam iki parçalı graf) düzlemsel değildir.

### Kuratowski Teoremi

Bir graf, K₅ veya K₃,₃ graflarının bir alt bölümünü (subdivision) içermiyorsa ve yalnızca bu durumda düzlemseldir.

### Örnek

Devre kartları, düzlemsel graflar olarak tasarlanmalıdır, çünkü iletken yollar fiziksel olarak kesişmemelidir.

## Ağaçlar (Trees)

Ağaç, döngüsüz ve bağlantılı bir graftır.

### Özellikleri

- n düğümlü bir ağaçta tam olarak n-1 kenar vardır.
- Herhangi iki düğüm arasında tam olarak bir yol vardır.
- Herhangi bir kenarın çıkarılması, grafı bağlantısız hale getirir.
- Herhangi bir kenarın eklenmesi, bir döngü oluşturur.

### Örnek

Dosya sistemi hiyerarşisi, bir ağaç olarak modellenebilir: klasörler ve dosyalar düğümleri, içerme ilişkileri kenarları temsil eder.

## Ormanlar (Forests)

Orman, döngüsüz bir graftır (ve dolayısıyla ağaçların birleşimidir).

### Özellikleri

- n düğümlü ve k bileşenli bir ormanda, kenar sayısı n-k'dir.
- Her bileşen bir ağaçtır.

### Örnek

Birbirinden bağımsız birkaç şirketin organizasyon yapısı, bir orman olarak modellenebilir.

## Çemberler (Cycles)

Çember, her düğümün tam olarak iki komşusu olduğu bağlantılı bir graftır. n düğümlü bir çember, Cₙ olarak gösterilir.

### Özellikleri

- Cₙ grafında tam olarak n kenar vardır.
- Cₙ grafı 2-düzenlidir.
- Cₙ grafında, herhangi bir kenarın çıkarılması, grafı bir yola dönüştürür.

### Örnek

Dairesel bir masa etrafında oturan insanlar, bir çember graf olarak modellenebilir.

## Tekerlekler (Wheels)

Tekerlek graf, bir merkez düğüm ve bu düğüme bağlı bir çemberden oluşur. n+1 düğümlü bir tekerlek, Wₙ olarak gösterilir.

### Özellikleri

- Wₙ grafında 2n kenar vardır.
- Merkez düğümün derecesi n, diğer tüm düğümlerin derecesi 3'tür.

### Örnek

Bir bisiklet tekerleği, tekerlek graf olarak modellenebilir: göbek merkez düğümü, jant çemberi ve ispitler kenarları temsil eder.

## Özel Graflar

### Petersen Grafı

Petersen grafı, graf teorisinde önemli bir örnektir. 10 düğüm ve 15 kenardan oluşur ve birçok ilginç özelliğe sahiptir.

#### Özellikleri

- 3-düzenlidir.
- Köprüsüzdür (her kenar bir döngünün parçasıdır).
- Düzlemsel değildir.
- Hamilton döngüsü yoktur.

### Kübik Graflar

Kübik graf, tüm düğümlerinin derecesi 3 olan bir graftır.

#### Özellikleri

- n düğümlü bir kübik grafta, kenar sayısı 3n/2'dir.
- Petersen grafı bir kübik graftır.

### Özel Grafların Uygulamaları

Özel graflar, belirli problemleri modellemek için kullanılabilir ve genellikle bu problemlerin çözümünde önemli rol oynar. Örneğin, Petersen grafı, çeşitli graf teorisi problemlerinde karşı örnek olarak kullanılır.

## Graf Türlerinin Karşılaştırılması

| Graf Türü | Düğüm Sayısı | Kenar Sayısı | Özellikler |
|-----------|--------------|--------------|------------|
| Tam Graf (Kₙ) | n | n(n-1)/2 | Her düğüm çifti bağlıdır |
| Tam İki Parçalı Graf (Kₘ,ₙ) | m+n | m×n | İki küme arasında tüm olası kenarlar |
| Çember (Cₙ) | n | n | Her düğümün derecesi 2 |
| Yol (Pₙ) | n | n-1 | İki uç düğümün derecesi 1, diğerlerinin 2 |
| Ağaç | n | n-1 | Döngüsüz ve bağlantılı |
| Tekerlek (Wₙ) | n+1 | 2n | Bir merkez ve bir çember |

## Gerçek Hayat Uygulamaları

Graf türleri, gerçek hayattaki çeşitli sistemleri modellemek için kullanılır:

1. **Sosyal Ağlar**: İnsanlar arası ilişkiler genellikle basit graflarla modellenir.
2. **Ulaşım Ağları**: Şehirler ve yollar ağırlıklı graflarla modellenir.
3. **İnternet Topolojisi**: Web sayfaları ve bağlantıları yönlü graflarla modellenir.
4. **Organizasyon Yapıları**: Şirket hiyerarşileri ağaçlarla modellenir.
5. **Kimyasal Bileşikler**: Moleküler yapılar graflarla modellenir.
6. **Bilgisayar Ağları**: Ağ cihazları ve bağlantıları graflarla modellenir.

Her bir graf türü, belirli özelliklere sahiptir ve bu özellikler, modelledikleri gerçek dünya problemlerinin analizinde önemli rol oynar.
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
# 7. Ağlar ve Akışlar (Networks and Flows)

## Ağ Kavramı

Bir ağ, kenarlarına kapasite değerleri atanmış yönlü bir graftır. Ağlar, su, elektrik, trafik veya veri gibi bir şeyin bir noktadan diğerine akışını modellemek için kullanılır.

### Formal Tanım

Bir ağ N = (G, c, s, t), aşağıdaki bileşenlerden oluşur:
- G = (V, E), yönlü bir graftır.
- c: E → R⁺, her kenara bir pozitif kapasite değeri atayan bir fonksiyondur.
- s ∈ V, ağın kaynak (source) düğümüdür.
- t ∈ V, ağın hedef (sink) düğümüdür.

## Akış Kavramı

Bir ağda akış, her kenar üzerinden geçen "madde" miktarını temsil eder. Akış, kapasite sınırlarını aşamaz ve her düğümde korunmalıdır (giren akış = çıkan akış, kaynak ve hedef düğümler hariç).

### Formal Tanım

Bir N = (G, c, s, t) ağında bir akış, f: E → R⁺ fonksiyonudur, öyle ki:
1. **Kapasite Kısıtı**: Her (u, v) ∈ E için, 0 ≤ f(u, v) ≤ c(u, v).
2. **Akış Korunumu**: Her v ∈ V - {s, t} için, ∑(u,v)∈E f(u, v) = ∑(v,w)∈E f(v, w).

### Akış Değeri

Bir akışın değeri |f|, kaynaktan çıkan toplam akış miktarıdır:
|f| = ∑(s,v)∈E f(s, v) - ∑(v,s)∈E f(v, s)

## Maksimum Akış Problemi

Maksimum akış problemi, bir ağda kaynaktan hedefe giden maksimum akış miktarını bulmayı amaçlar.

### Ford-Fulkerson Algoritması

Ford-Fulkerson algoritması, maksimum akış problemini çözmek için kullanılan bir yöntemdir:

```
Algorithm FordFulkerson(G, c, s, t):
    Initialize flow f(u, v) = 0 for all edges (u, v)
    While there exists an augmenting path p from s to t in the residual network Gf:
        Find cf(p) = min{cf(u, v) : (u, v) is in p}
        For each edge (u, v) in p:
            If (u, v) is a forward edge:
                f(u, v) = f(u, v) + cf(p)
            Else:
                f(v, u) = f(v, u) - cf(p)
    Return f
```

Burada, cf(u, v) artık kapasite olarak adlandırılır ve şu şekilde tanımlanır:
- Eğer (u, v) ∈ E, cf(u, v) = c(u, v) - f(u, v)
- Eğer (v, u) ∈ E, cf(u, v) = f(v, u)

### Edmonds-Karp Algoritması

Edmonds-Karp algoritması, Ford-Fulkerson algoritmasının bir varyasyonudur ve artırma yollarını bulmak için BFS kullanır:

```
Algorithm EdmondsKarp(G, c, s, t):
    Initialize flow f(u, v) = 0 for all edges (u, v)
    While there exists an augmenting path p from s to t in the residual network Gf:
        Find p using BFS to get the shortest augmenting path
        Find cf(p) = min{cf(u, v) : (u, v) is in p}
        For each edge (u, v) in p:
            If (u, v) is a forward edge:
                f(u, v) = f(u, v) + cf(p)
            Else:
                f(v, u) = f(v, u) - cf(p)
    Return f
```

Edmonds-Karp algoritması, O(V·E²) zaman karmaşıklığına sahiptir.

### Dinic Algoritması

Dinic algoritması, maksimum akış problemini çözmek için daha verimli bir algoritmadır:

```
Algorithm Dinic(G, c, s, t):
    Initialize flow f(u, v) = 0 for all edges (u, v)
    While BFS(G, s, t) returns true:
        While there exists a blocking flow in the level graph:
            Augment f with the blocking flow
    Return f
```

Dinic algoritması, O(V²·E) zaman karmaşıklığına sahiptir.

## Minimum Kesit Problemi

Bir ağda bir kesit (S, T), düğüm kümesinin V = S ∪ T ve S ∩ T = ∅ olacak şekilde iki parçaya ayrılmasıdır, öyle ki s ∈ S ve t ∈ T. Kesitin kapasitesi, S'den T'ye giden kenarların kapasitelerinin toplamıdır.

Minimum kesit problemi, minimum kapasiteye sahip bir kesit bulmayı amaçlar.

### Maksimum Akış - Minimum Kesit Teoremi

Maksimum akış - minimum kesit teoremi, bir ağda maksimum akış değerinin, minimum kesit kapasitesine eşit olduğunu belirtir. Bu, maksimum akış probleminin çözümünün aynı zamanda minimum kesit probleminin de çözümünü verdiği anlamına gelir.

## Ağ Akışı Uygulamaları

### Bipartite Eşleştirme (Bipartite Matching)

Bipartite eşleştirme problemi, iki parçalı bir grafta maksimum sayıda eşleşen kenar bulmayı amaçlar. Bu problem, bir ağ akışı problemi olarak modellenebilir:
- Her sol düğüm için kaynaktan bir kenar ekleyin, kapasite 1.
- Her sağ düğüm için hedefe bir kenar ekleyin, kapasite 1.
- Orijinal graftaki her kenar için, sol düğümden sağ düğüme bir kenar ekleyin, kapasite 1.
- Maksimum akışı bulun, bu maksimum eşleştirme sayısına eşittir.

### Çok Kaynaklı Çok Hedefli Akış

Birden fazla kaynak ve hedef düğümü olan ağlarda, problemi standart tek kaynak-tek hedef problemine dönüştürebiliriz:
- Yeni bir süper kaynak ekleyin ve tüm kaynaklardan bu süper kaynağa sonsuz kapasiteli kenarlar ekleyin.
- Yeni bir süper hedef ekleyin ve tüm hedeflerden bu süper hedefe sonsuz kapasiteli kenarlar ekleyin.
- Süper kaynaktan süper hedefe maksimum akışı bulun.

### Dolaşım Problemi (Circulation Problem)

Dolaşım problemi, her düğümde akış korunumunun sağlandığı (giren akış = çıkan akış) bir akış bulmayı amaçlar. Bu problem, her düğüm için bir talep değeri belirleyerek genelleştirilebilir.

## Minimum Maliyet Akış Problemi

Minimum maliyet akış problemi, her kenara bir maliyet değeri atandığında, belirli bir akış değeri için toplam maliyeti minimize eden akışı bulmayı amaçlar.

### Maliyet-Ölçekli Ağ Simpleks Algoritması

Maliyet-ölçekli ağ simpleks algoritması, minimum maliyet akış problemini çözmek için kullanılan bir yöntemdir:

```
Algorithm CostScalingNetworkSimplex(G, c, d, b):
    Initialize a feasible flow f
    While f is not optimal:
        Find a negative cost cycle in the residual network
        Augment f along the cycle
    Return f
```

Burada, c maliyet fonksiyonu, d kapasite fonksiyonu ve b talep fonksiyonudur.

## Çok Ürünlü Akış Problemi (Multicommodity Flow Problem)

Çok ürünlü akış problemi, birden fazla ürünün aynı ağ üzerinde akışını modellemek için kullanılır. Her ürün için ayrı bir kaynak-hedef çifti ve akış değeri vardır.

### Doğrusal Programlama Yaklaşımı

Çok ürünlü akış problemi, doğrusal programlama kullanılarak çözülebilir:

```
Maximize ∑k fk
Subject to:
    For each edge (u, v):
        ∑k fk(u, v) ≤ c(u, v)
    For each commodity k and each vertex v ≠ sk, tk:
        ∑(u,v) fk(u, v) = ∑(v,w) fk(v, w)
    For each commodity k:
        ∑(sk,v) fk(sk, v) - ∑(v,sk) fk(v, sk) = fk
        ∑(v,tk) fk(v, tk) - ∑(tk,v) fk(tk, v) = fk
    For all edges (u, v) and commodities k:
        fk(u, v) ≥ 0
```

## Dinamik Akışlar

Dinamik akışlar, zaman içinde değişen ağlarda akışı modellemek için kullanılır. Her kenarın bir kapasite ve bir geçiş süresi vardır.

### En Erken Varış Problemi

En erken varış problemi, kaynaktan hedefe en kısa sürede ulaşmayı amaçlar. Bu problem, zaman-genişletilmiş ağ üzerinde en kısa yol problemi olarak çözülebilir.

### Maksimum Dinamik Akış Problemi

Maksimum dinamik akış problemi, belirli bir zaman diliminde kaynaktan hedefe maksimum miktarda akışı göndermeyi amaçlar.

## Gerçek Hayat Uygulamaları

Ağ akışı problemleri, birçok gerçek dünya uygulamasında karşımıza çıkar:

1. **Ulaşım Ağları**: Şehirler arası yol ağlarında trafik akışını optimize etmek için kullanılır.

2. **Telekomünikasyon Ağları**: Veri paketlerinin ağ üzerindeki akışını modellemek için kullanılır.

3. **Enerji Dağıtım Ağları**: Elektrik şebekelerinde güç akışını optimize etmek için kullanılır.

4. **Su Dağıtım Sistemleri**: Su şebekelerinde su akışını modellemek için kullanılır.

5. **Üretim ve Dağıtım**: Ürünlerin fabrikalardan depolara ve mağazalara akışını optimize etmek için kullanılır.

6. **İş Atama**: Çalışanları görevlere atamak için kullanılır (bipartite eşleştirme).

7. **Spor Turnuvaları**: Takımların turnuva programını belirlemek için kullanılır.

Ağ akışı, graf teorisinin en güçlü ve en yaygın kullanılan uygulamalarından biridir ve birçok karmaşık optimizasyon problemini çözmek için kullanılır.
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
# 10. Karmaşıklık Konuları

## Hesaplama Karmaşıklığı ve Graf Teorisi

Hesaplama karmaşıklığı, bir algoritmanın çalışması için gereken kaynakları (zaman ve bellek) ölçen bir kavramdır. Graf teorisinde, birçok problem farklı karmaşıklık sınıflarına aittir ve bu, problemlerin çözülebilirliğini ve verimli algoritmaların varlığını belirler.

### Karmaşıklık Sınıfları

#### P Sınıfı

P sınıfı, polinom zamanda çözülebilen problemleri içerir. Bir problem, giriş boyutunun bir polinomu kadar adımda çözülebiliyorsa P sınıfındadır. Graf teorisinde P sınıfına ait bazı problemler şunlardır:
- Bir grafın bağlantılı olup olmadığını belirleme
- Bir grafın iki parçalı olup olmadığını belirleme
- Bir grafta en kısa yolu bulma (Dijkstra algoritması)
- Minimum kapsayan ağaç bulma (Kruskal veya Prim algoritması)

#### NP Sınıfı

NP sınıfı, çözümünün polinom zamanda doğrulanabildiği problemleri içerir. P sınıfı, NP sınıfının bir alt kümesidir (P ⊆ NP). Graf teorisinde NP sınıfına ait bazı problemler şunlardır:
- Hamilton yolu veya döngüsü bulma
- Grafı k renkle renklendirme (k ≥ 3 için)
- Maksimum klik bulma
- Minimum düğüm örtüsü bulma

#### NP-tam Sınıfı

NP-tam sınıfı, NP sınıfındaki en zor problemleri içerir. Bir problem, NP sınıfındaki her problemi polinom zamanda kendisine indirgenebiliyorsa NP-tamdır. Graf teorisinde NP-tam olan bazı problemler şunlardır:
- Hamilton döngüsü problemi
- Graf renklendirme problemi (k ≥ 3 için)
- Maksimum klik problemi
- Minimum düğüm örtüsü problemi

#### NP-zor Sınıfı

NP-zor sınıfı, en az NP-tam problemler kadar zor olan problemleri içerir. Bu problemler NP sınıfında olmak zorunda değildir. Graf teorisinde NP-zor olan bazı problemler şunlardır:
- Gezgin satıcı problemi
- Graf izomorfizmi problemi
- Steiner ağacı problemi

## Graf Teorisindeki Temel NP-tam Problemler

### Hamilton Döngüsü Problemi

Hamilton döngüsü problemi, bir grafta her düğümü tam olarak bir kez ziyaret eden ve başlangıç düğümüne dönen bir döngü olup olmadığını belirleme problemidir. Bu problem NP-tamdır ve büyük graflar için etkili bir algoritma bilinmemektedir.

### Graf Renklendirme Problemi

Graf renklendirme problemi, bir grafın düğümlerini k renkle, komşu düğümlerin farklı renklere sahip olacağı şekilde renklendirmenin mümkün olup olmadığını belirleme problemidir. k ≥ 3 için bu problem NP-tamdır.

### Maksimum Klik Problemi

Maksimum klik problemi, bir grafta tam alt graf oluşturan maksimum düğüm kümesini bulma problemidir. Bu problem NP-zordur.

### Minimum Düğüm Örtüsü Problemi

Minimum düğüm örtüsü problemi, bir grafın tüm kenarlarını kapsayan minimum düğüm kümesini bulma problemidir. Bu problem NP-zordur.

## Yaklaşık Algoritmalar

NP-zor problemler için, optimal çözümü garanti eden verimli algoritmalar bilinmediğinden, genellikle yaklaşık algoritmalar kullanılır. Bu algoritmalar, optimal çözüme yakın bir çözüm bulurlar.

### Yaklaşım Oranı

Bir yaklaşık algoritmanın performansı, yaklaşım oranı ile ölçülür. Yaklaşım oranı, algoritmanın bulduğu çözümün değerinin optimal çözümün değerine oranıdır. Bir minimizasyon problemi için, yaklaşım oranı 1'den büyük olmalıdır; bir maksimizasyon problemi için, yaklaşım oranı 0 ile 1 arasında olmalıdır.

### Graf Renklendirme İçin Yaklaşık Algoritmalar

Graf renklendirme problemi için, çeşitli yaklaşık algoritmalar vardır:
- Açgözlü renklendirme algoritması, en kötü durumda Δ(G) + 1 renk kullanır, burada Δ(G) grafın maksimum derecesidir.
- Welsh-Powell algoritması, düğümleri derecelerine göre azalan sırada işler ve genellikle daha iyi sonuçlar verir.

### Gezgin Satıcı Problemi İçin Yaklaşık Algoritmalar

Gezgin Satıcı Problemi için, çeşitli yaklaşık algoritmalar vardır:
- En yakın komşu algoritması, her adımda mevcut şehre en yakın henüz ziyaret edilmemiş şehri seçer.
- 2-opt algoritması, mevcut turdaki iki kenarı çıkarıp iki yeni kenarla değiştirerek turu iyileştirir.
- Christofides algoritması, metrik TSP için 3/2 yaklaşım oranına sahiptir.

## Sabit Parametre Uygulanabilir Algoritmalar

Sabit parametre uygulanabilir (FPT) algoritmalar, bir problemin karmaşıklığını bir parametre cinsinden analiz eder. Eğer bir problem, giriş boyutu n ve parametre k için f(k) · n^O(1) zamanda çözülebiliyorsa, o problem FPT'dir.

### Ağaç Genişliği

Ağaç genişliği, bir grafın ağaç benzeri yapısını ölçen bir parametredir. Ağaç genişliği küçük olan graflar için, birçok NP-zor problem verimli bir şekilde çözülebilir.

### Ağaç Ayrışımı

Ağaç ayrışımı, bir grafı bir ağaç yapısına dönüştürme işlemidir. Ağaç ayrışımı, dinamik programlama algoritmalarının uygulanmasını kolaylaştırır.

### FPT Algoritmaları

Graf teorisinde FPT olan bazı problemler şunlardır:
- k-düğüm örtüsü problemi
- k-yol problemi
- k-renklendirme problemi (ağaç genişliği sınırlı graflar için)

## Grafların Sınıflandırılması

Graflar, çeşitli özelliklere göre sınıflandırılabilir ve bu sınıflandırma, belirli problemlerin karmaşıklığını anlamak için önemlidir.

### Mükemmel Graflar

Mükemmel graflar, her indüklenmiş alt grafın kromatik sayısının maksimum klik boyutuna eşit olduğu graflardır. Mükemmel graflarda, maksimum klik ve minimum renklendirme problemleri polinom zamanda çözülebilir.

### Düzlemsel Graflar

Düzlemsel graflar, kenarları kesişmeden bir düzlemde çizilebilen graflardır. Düzlemsel graflarda, birçok NP-zor problem daha verimli algoritmalarla çözülebilir. Örneğin, düzlemsel graflarda 4-renklendirme her zaman mümkündür (Dört Renk Teoremi).

### Minör Kapalı Graf Sınıfları

Minör kapalı graf sınıfları, belirli grafları minör olarak içermeyen graf sınıflarıdır. Robertson-Seymour teoremi, her minör kapalı graf sınıfı için bir sonlu engel kümesi olduğunu belirtir. Bu, belirli graf sınıflarını tanımak için verimli algoritmalar geliştirmeye olanak tanır.

## Karmaşıklık ve Algoritma Tasarımı

Graf teorisi problemlerinin karmaşıklığını anlamak, etkili algoritmaların tasarlanması için önemlidir.

### Algoritma Tasarım Teknikleri

Graf teorisi problemlerini çözmek için çeşitli algoritma tasarım teknikleri kullanılır:
- Açgözlü algoritmalar
- Dinamik programlama
- Dallandırma ve sınırlama
- Yerel arama
- Genetik algoritmalar
- Yapay sinir ağları

### Paralel Algoritmalar

Büyük graf problemleri için, paralel algoritmalar kullanılabilir. Paralel algoritmalar, işlemi birden fazla işlemci arasında bölerek hesaplama süresini azaltır.

### Dağıtık Algoritmalar

Dağıtık algoritmalar, büyük ölçekli graf problemlerini çözmek için kullanılır. Bu algoritmalar, grafın farklı parçalarını farklı bilgisayarlarda işler ve sonuçları birleştirir.

## Büyük Ölçekli Graf Problemleri

Günümüzde, sosyal ağlar, web grafları ve biyolojik ağlar gibi büyük ölçekli graflarla karşılaşıyoruz. Bu graflar milyarlarca düğüm ve kenar içerebilir ve geleneksel algoritmalar bu graflar için yetersiz kalabilir.

### Büyük Veri Teknikleri

Büyük ölçekli graf problemlerini çözmek için, büyük veri teknikleri kullanılır:
- MapReduce
- Pregel
- GraphX
- Spark GraphFrames

### Örnekleme ve Yaklaşım

Büyük ölçekli graflarda, tüm grafı işlemek yerine, grafın bir örneğini alıp bu örnek üzerinde çalışmak daha verimli olabilir. Örnekleme teknikleri, büyük grafların özelliklerini koruyarak daha küçük graflar oluşturmayı amaçlar.

### Çevrimiçi Algoritmalar

Çevrimiçi algoritmalar, grafın tamamını önceden bilmeden, düğümleri ve kenarları sırayla işler. Bu algoritmalar, dinamik olarak değişen graflarda kullanışlıdır.

## Gerçek Hayat Uygulamaları

Graf teorisi karmaşıklık konuları, birçok gerçek dünya uygulamasında karşımıza çıkar:

1. **Ağ Tasarımı**: Telekomünikasyon ağları, bilgisayar ağları ve ulaşım ağları tasarımında, NP-zor problemlerin yaklaşık çözümleri kullanılır.

2. **Zamanlama**: Sınav programı, iş çizelgeleme ve spor turnuvası düzenleme gibi zamanlama problemleri, genellikle NP-zor graf problemleri olarak modellenebilir.

3. **Biyoinformatik**: DNA dizileme, protein yapısı analizi ve metabolik ağ analizi gibi biyoinformatik uygulamaları, graf teorisi algoritmalarını kullanır.

4. **Sosyal Ağ Analizi**: Topluluk tespiti, etki maksimizasyonu ve bilgi yayılımı gibi sosyal ağ analizi problemleri, graf teorisi algoritmalarını kullanır.

5. **Web Arama**: Web sayfalarını sıralamak için kullanılan PageRank algoritması, web grafının yapısını analiz eder.

Graf teorisi karmaşıklık konuları, teorik bilgisayar biliminin temel alanlarından biridir ve birçok gerçek dünya problemini modellemek ve çözmek için kullanılır.
# 11. Örnek Problemler ve Çözümler

Bu bölümde, graf teorisinin çeşitli konularını kapsayan örnek problemler ve detaylı çözümler sunulmuştur. Bu problemler, teorik bilgileri pekiştirmenize ve pratik uygulamalar yapmanıza yardımcı olacaktır.

## İçindekiler

1. [Temel Kavramlar ve Graf Türleri](#temel-kavramlar-ve-graf-türleri)
2. [Bağlantılılık ve Yollar](#bağlantılılık-ve-yollar)
3. [Ağaçlar ve Minimum Kapsayan Ağaçlar](#ağaçlar-ve-minimum-kapsayan-ağaçlar)
4. [Ağlar ve Akışlar](#ağlar-ve-akışlar)
5. [Euler ve Hamilton Grafları](#euler-ve-hamilton-grafları)
6. [Renklendirme Problemleri](#renklendirme-problemleri)
7. [Karmaşıklık Konuları](#karmaşıklık-konuları)

Her bölüm, ilgili konuyla ilgili çeşitli zorluk seviyelerinde problemler içermektedir. Problemlerin çözümleri adım adım açıklanmıştır.
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
# Örnek Problem 5: Euler ve Hamilton Grafları

## Problem 5.1: Euler Yolu ve Döngüsü

**Problem:** Aşağıdaki graflar için:
1. Her grafın Euler yolu ve/veya Euler döngüsüne sahip olup olmadığını belirleyiniz.
2. Eğer Euler yolu veya döngüsü varsa, bir örnek veriniz.

Graf G₁:
- Düğümler: a, b, c, d, e
- Kenarlar: (a,b), (a,c), (b,c), (b,d), (c,d), (c,e), (d,e)

Graf G₂:
- Düğümler: p, q, r, s, t, u
- Kenarlar: (p,q), (p,r), (p,s), (q,t), (r,t), (r,u), (s,u), (t,u)

**Çözüm:**

Bir yönsüz grafta Euler yolu vardır ancak ve ancak:
1. Graf bağlantılıdır (tek düğüm hariç).
2. Grafta tam olarak iki düğümün derecesi tek sayıdır (bu düğümler Euler yolunun başlangıç ve bitiş düğümleridir) veya tüm düğümlerin derecesi çift sayıdır (bu durumda Euler yolu aynı zamanda bir Euler döngüsüdür).

Bir yönsüz grafta Euler döngüsü vardır ancak ve ancak:
1. Graf bağlantılıdır (tek düğüm hariç).
2. Tüm düğümlerin derecesi çift sayıdır.

Graf G₁ için:
- Düğümlerin dereceleri: d(a)=2, d(b)=3, d(c)=4, d(d)=3, d(e)=2
- Tek dereceli düğüm sayısı: 2 (b ve d)
- Graf bağlantılıdır.

Sonuç: Graf G₁, bir Euler yoluna sahiptir, ancak Euler döngüsüne sahip değildir. Euler yolu b düğümünden başlayıp d düğümünde bitmelidir (veya tersi).

Örnek Euler yolu: b → a → c → b → d → c → e → d

Graf G₂ için:
- Düğümlerin dereceleri: d(p)=3, d(q)=2, d(r)=3, d(s)=2, d(t)=3, d(u)=3
- Tek dereceli düğüm sayısı: 4 (p, r, t, u)
- Graf bağlantılıdır.

Sonuç: Graf G₂, bir Euler yoluna veya döngüsüne sahip değildir, çünkü ikiden fazla düğümün derecesi tek sayıdır.

## Problem 5.2: Hamilton Yolu ve Döngüsü

**Problem:** Aşağıdaki graflar için:
1. Her grafın Hamilton yolu ve/veya Hamilton döngüsüne sahip olup olmadığını belirleyiniz.
2. Eğer Hamilton yolu veya döngüsü varsa, bir örnek veriniz.

Graf H₁:
- Düğümler: 1, 2, 3, 4, 5
- Kenarlar: (1,2), (1,3), (1,5), (2,3), (2,4), (3,4), (4,5)

Graf H₂:
- Düğümler: a, b, c, d, e, f
- Kenarlar: (a,b), (a,c), (a,f), (b,c), (c,d), (d,e), (e,f)

**Çözüm:**

Bir Hamilton yolu, bir graftaki her düğümü tam olarak bir kez ziyaret eden bir yoldur. Bir Hamilton döngüsü, bir Hamilton yoludur ve aynı zamanda başlangıç düğümüne geri döner.

Hamilton yolu ve döngüsü için Euler yolu ve döngüsü gibi basit gerekli ve yeterli koşullar yoktur. Ancak, bazı yeterli koşullar vardır:

- Dirac Teoremi: Eğer n ≥ 3 düğümlü bir grafta her düğümün derecesi en az n/2 ise, graf bir Hamilton döngüsüne sahiptir.
- Ore Teoremi: Eğer n ≥ 3 düğümlü bir grafta, komşu olmayan herhangi iki düğümün derecelerinin toplamı en az n ise, graf bir Hamilton döngüsüne sahiptir.

Graf H₁ için:
- Düğümlerin dereceleri: d(1)=3, d(2)=3, d(3)=3, d(4)=3, d(5)=2
- Düğüm sayısı n = 5
- Her düğümün derecesi en az n/2 = 5/2 = 2.5 değil (5'in derecesi 2).
- Ancak, bu sadece bir yeterli koşuldur, gerekli değildir.

Grafı incelediğimizde, bir Hamilton döngüsü bulabiliriz: 1 → 2 → 3 → 4 → 5 → 1
Dolayısıyla, Graf H₁ bir Hamilton döngüsüne (ve dolayısıyla bir Hamilton yoluna) sahiptir.

Graf H₂ için:
- Düğümlerin dereceleri: d(a)=3, d(b)=2, d(c)=3, d(d)=2, d(e)=2, d(f)=2
- Düğüm sayısı n = 6
- Her düğümün derecesi en az n/2 = 6/2 = 3 değil (b, d, e, f'nin dereceleri 2).

Grafı incelediğimizde, bir Hamilton yolu bulabiliriz: a → b → c → d → e → f
Ancak, bir Hamilton döngüsü bulamayız, çünkü f'den a'ya doğrudan bir kenar yoktur.

Dolayısıyla, Graf H₂ bir Hamilton yoluna sahiptir, ancak Hamilton döngüsüne sahip değildir.

## Problem 5.3: Gezgin Satıcı Problemi

**Problem:** Aşağıdaki ağırlıklı tam graf için, en yakın komşu algoritmasını kullanarak Gezgin Satıcı Problemi'nin yaklaşık çözümünü bulunuz. 1 düğümünden başlayınız.

- Düğümler: 1, 2, 3, 4, 5
- Kenarlar ve ağırlıkları:
  - (1,2): 10, (1,3): 15, (1,4): 20, (1,5): 25
  - (2,3): 35, (2,4): 25, (2,5): 30
  - (3,4): 15, (3,5): 20
  - (4,5): 10

**Çözüm:**

En yakın komşu algoritması, her adımda mevcut şehre en yakın henüz ziyaret edilmemiş şehri seçer. 1 düğümünden başlayarak uygulayalım:

1. Başlangıç düğümü: 1
   - Ziyaret edilen düğümler: {1}
   - Mevcut tur: 1

2. 1'e en yakın ziyaret edilmemiş düğüm: 2 (mesafe: 10)
   - Ziyaret edilen düğümler: {1, 2}
   - Mevcut tur: 1 → 2
   - Tur uzunluğu: 10

3. 2'ye en yakın ziyaret edilmemiş düğüm: 4 (mesafe: 25)
   - Ziyaret edilen düğümler: {1, 2, 4}
   - Mevcut tur: 1 → 2 → 4
   - Tur uzunluğu: 10 + 25 = 35

4. 4'e en yakın ziyaret edilmemiş düğüm: 5 (mesafe: 10)
   - Ziyaret edilen düğümler: {1, 2, 4, 5}
   - Mevcut tur: 1 → 2 → 4 → 5
   - Tur uzunluğu: 10 + 25 + 10 = 45

5. 5'e en yakın ziyaret edilmemiş düğüm: 3 (mesafe: 20)
   - Ziyaret edilen düğümler: {1, 2, 3, 4, 5}
   - Mevcut tur: 1 → 2 → 4 → 5 → 3
   - Tur uzunluğu: 10 + 25 + 10 + 20 = 65

6. Turu tamamlamak için 3'ten 1'e dönüş (mesafe: 15)
   - Mevcut tur: 1 → 2 → 4 → 5 → 3 → 1
   - Tur uzunluğu: 10 + 25 + 10 + 20 + 15 = 80

Dolayısıyla, en yakın komşu algoritması ile bulunan yaklaşık çözüm:
- Tur: 1 → 2 → 4 → 5 → 3 → 1
- Toplam uzunluk: 80

Not: Bu, optimal çözüm olmayabilir. Gezgin Satıcı Problemi NP-zordur ve en yakın komşu algoritması bir sezgisel yaklaşımdır.
# Örnek Problem 6: Renklendirme Problemleri

## Problem 6.1: Düğüm Renklendirme

**Problem:** Aşağıdaki graf için:
1. Açgözlü renklendirme algoritmasını kullanarak düğümleri renklendirin.
2. Grafın kromatik sayısını belirleyin.
3. Optimal bir renklendirme bulun.

Graf G:
- Düğümler: a, b, c, d, e, f
- Kenarlar: (a,b), (a,c), (a,d), (b,c), (b,e), (c,d), (c,f), (d,e), (d,f), (e,f)

**Çözüm:**

1. Açgözlü renklendirme algoritması, düğümleri belirli bir sırayla işler ve her düğüme, komşularının renklerini dikkate alarak mümkün olan en küçük renk numarasını atar. Düğümleri alfabetik sırayla işleyelim:

   - a: Renk 1 (henüz hiçbir komşusu renklendirilmedi)
   - b: Renk 2 (a'nın komşusu ve a Renk 1)
   - c: Renk 3 (a ve b'nin komşusu, a Renk 1, b Renk 2)
   - d: Renk 2 (a ve c'nin komşusu, a Renk 1, c Renk 3)
   - e: Renk 1 (b ve d'nin komşusu, b Renk 2, d Renk 2)
   - f: Renk 1 (c ve d'nin komşusu, c Renk 3, d Renk 2)

   Açgözlü renklendirme sonucu:
   - a: Renk 1
   - b: Renk 2
   - c: Renk 3
   - d: Renk 2
   - e: Renk 1
   - f: Renk 1

   Bu renklendirme 3 renk kullanır.

2. Grafın kromatik sayısını belirlemek için, grafın yapısını analiz edelim. Grafdaki a, b, c düğümleri bir üçgen (tam alt graf K₃) oluşturur, bu nedenle kromatik sayı en az 3 olmalıdır. Ayrıca, yukarıda 3 renkle bir renklendirme bulduk, bu nedenle kromatik sayı en fazla 3'tür. Dolayısıyla, grafın kromatik sayısı χ(G) = 3'tür.

3. Optimal bir renklendirme, minimum sayıda renk kullanan bir renklendirmedir. Kromatik sayı 3 olduğundan, 3 renkle bir renklendirme optimal olacaktır. Yukarıda bulduğumuz renklendirme zaten optimaldir:
   - Renk 1: a, e, f
   - Renk 2: b, d
   - Renk 3: c

   Alternatif bir optimal renklendirme:
   - Renk 1: a, f
   - Renk 2: b, d
   - Renk 3: c, e

## Problem 6.2: Kenar Renklendirme

**Problem:** Aşağıdaki graf için:
1. Kenar kromatik sayısını belirleyin.
2. Optimal bir kenar renklendirmesi bulun.

Graf H:
- Düğümler: 1, 2, 3, 4, 5
- Kenarlar: (1,2), (1,3), (1,4), (2,3), (2,5), (3,4), (3,5), (4,5)

**Çözüm:**

1. Bir grafın kenar kromatik sayısı χ'(G), Δ(G) ≤ χ'(G) ≤ Δ(G) + 1 sınırları içindedir (Vizing teoremi). Burada Δ(G) grafın maksimum derecesidir.

   Graf H'deki düğümlerin dereceleri:
   - d(1) = 3
   - d(2) = 3
   - d(3) = 4
   - d(4) = 3
   - d(5) = 3

   Maksimum derece Δ(H) = 4'tür. Dolayısıyla, 4 ≤ χ'(H) ≤ 5.

   Grafın yapısını incelediğimizde, 3 düğümünün 4 komşusu vardır ve bu 4 kenarın hepsi farklı renkler almalıdır. Bu nedenle, kenar kromatik sayısı en az 4 olmalıdır. Ayrıca, aşağıda 4 renkle bir kenar renklendirmesi bulacağız, bu da kenar kromatik sayısının en fazla 4 olduğunu gösterir. Dolayısıyla, χ'(H) = 4'tür.

2. Optimal bir kenar renklendirmesi için, her düğümün tüm kenarlarının farklı renklerle renklendirilmesi gerektiğini unutmayın. 4 renk kullanarak bir kenar renklendirmesi bulalım:

   - (1,2): Renk 1
   - (1,3): Renk 2
   - (1,4): Renk 3
   - (2,3): Renk 3
   - (2,5): Renk 2
   - (3,4): Renk 1
   - (3,5): Renk 4
   - (4,5): Renk 2

   Bu renklendirmeyi doğrulayalım:
   - 1 düğümü: (1,2) Renk 1, (1,3) Renk 2, (1,4) Renk 3 - Tüm kenarlar farklı renkler.
   - 2 düğümü: (1,2) Renk 1, (2,3) Renk 3, (2,5) Renk 2 - Tüm kenarlar farklı renkler.
   - 3 düğümü: (1,3) Renk 2, (2,3) Renk 3, (3,4) Renk 1, (3,5) Renk 4 - Tüm kenarlar farklı renkler.
   - 4 düğümü: (1,4) Renk 3, (3,4) Renk 1, (4,5) Renk 2 - Tüm kenarlar farklı renkler.
   - 5 düğümü: (2,5) Renk 2, (3,5) Renk 4, (4,5) Renk 2 - Burada bir çelişki var, (2,5) ve (4,5) aynı rengi alamaz.

   Renklendirmeyi düzeltelim:
   - (4,5): Renk 4 (Renk 2 yerine)

   Düzeltilmiş renklendirme:
   - Renk 1: (1,2), (3,4)
   - Renk 2: (1,3), (2,5)
   - Renk 3: (1,4), (2,3)
   - Renk 4: (3,5), (4,5)

   Bu, 4 renkle geçerli bir kenar renklendirmesidir ve optimaldir.

## Problem 6.3: Harita Renklendirme

**Problem:** Aşağıdaki harita için, komşu bölgelerin farklı renklerle boyanması gerektiğinde, minimum renk sayısını bulunuz ve bir renklendirme örneği veriniz.

Harita:
- Bölgeler: A, B, C, D, E, F
- Komşuluklar: A-B, A-C, A-D, B-C, B-E, C-D, C-F, D-E, D-F, E-F

**Çözüm:**

Harita renklendirme problemi, bir düğüm renklendirme problemi olarak modellenebilir. Her bölge bir düğüm olarak temsil edilir ve komşu bölgeler arasında bir kenar çizilir. Oluşan graf, Problem 6.1'deki G grafı ile aynıdır.

Problem 6.1'de gösterdiğimiz gibi, bu grafın kromatik sayısı 3'tür. Dolayısıyla, haritayı boyamak için gereken minimum renk sayısı 3'tür.

Optimal bir renklendirme:
- Renk 1 (Kırmızı): A, E, F
- Renk 2 (Mavi): B, D
- Renk 3 (Yeşil): C

Bu renklendirmede, hiçbir komşu bölge aynı rengi almaz, bu da geçerli bir harita renklendirmesidir.

Dört Renk Teoremi'ne göre, herhangi bir düzlemsel harita en fazla dört renkle renklendirilebilir. Bu harita için üç renk yeterlidir, çünkü grafın kromatik sayısı 3'tür.
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
