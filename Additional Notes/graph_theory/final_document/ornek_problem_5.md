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
