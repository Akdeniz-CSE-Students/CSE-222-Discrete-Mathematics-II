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
