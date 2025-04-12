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
