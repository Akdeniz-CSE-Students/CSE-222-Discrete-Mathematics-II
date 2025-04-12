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
