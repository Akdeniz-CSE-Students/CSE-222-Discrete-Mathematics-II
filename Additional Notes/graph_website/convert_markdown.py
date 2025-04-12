import markdown
import os
import re

# Ana içerik dosyasını oku
with open('/home/ubuntu/graph_theory/final_document/graf_teorisi_rehberi.md', 'r', encoding='utf-8') as f:
    content = f.read()

# Markdown'ı HTML'e dönüştür
html_content = markdown.markdown(content, extensions=['tables', 'fenced_code'])

# HTML şablonu oluştur
html_template = """<!DOCTYPE html>
<html lang="tr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Graf Teorisi Kapsamlı Rehber</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/mobile.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.7.0/styles/default.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.7.0/highlight.min.js"></script>
    <script>hljs.highlightAll();</script>
</head>
<body>
    <header>
        <div class="container">
            <h1>Graf Teorisi Kapsamlı Rehber</h1>
            <nav id="main-nav">
                <ul>
                    <li><a href="#1-graf-teorisine-giriş-ve-tarihçe">Giriş</a></li>
                    <li><a href="#2-temel-kavramlar-ve-tanımlar">Temel Kavramlar</a></li>
                    <li><a href="#3-graf-türleri-ve-özellikleri">Graf Türleri</a></li>
                    <li><a href="#4-bağlantılılık">Bağlantılılık</a></li>
                    <li><a href="#5-yollar-ve-döngüler">Yollar ve Döngüler</a></li>
                    <li><a href="#6-ağaçlar">Ağaçlar</a></li>
                    <li><a href="#7-ağlar-ve-akışlar">Ağlar ve Akışlar</a></li>
                    <li><a href="#8-euler-ve-hamilton-grafları">Euler ve Hamilton</a></li>
                    <li><a href="#9-renklendirme-problemleri">Renklendirme</a></li>
                    <li><a href="#10-karmaşıklık-konuları">Karmaşıklık</a></li>
                    <li><a href="#11-örnek-problemler-ve-çözümler">Örnek Problemler</a></li>
                </ul>
            </nav>
        </div>
    </header>
    
    <main class="container">
        <div id="content">
            {content}
        </div>
    </main>
    
    <footer>
        <div class="container">
            <p>&copy; 2025 Graf Teorisi Rehberi | Discrete Mathematics II</p>
        </div>
    </footer>
    
    <script src="js/script.js"></script>
</body>
</html>
"""

# İçeriği şablona yerleştir
html_output = html_template.format(content=html_content)

# HTML dosyasını kaydet
with open('/home/ubuntu/graph_website/index.html', 'w', encoding='utf-8') as f:
    f.write(html_output)

print("HTML dönüşümü tamamlandı. index.html dosyası oluşturuldu.")
