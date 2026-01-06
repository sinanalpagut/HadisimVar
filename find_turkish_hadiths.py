import urllib.request
import json

url = "https://cdn.jsdelivr.net/gh/fawazahmed0/hadith-api@1/editions.json"

try:
    with urllib.request.urlopen(url) as response:
        if response.getcode() == 200:
            data = json.loads(response.read().decode())
            turkish_editions = []
            for edition in data:
                name = edition.get('name', '')
                language = edition.get('language', '')
                if 'tur-' in name or 'Turkish' in language:
                    turkish_editions.append(edition)
            
            print(f"Bulunan Türkçe Kaynak Sayısı: {len(turkish_editions)}")
            for ed in turkish_editions:
                # Tam indirme linki genellikle: https://cdn.jsdelivr.net/gh/fawazahmed0/hadith-api@1/editions/{name}.json
                full_url = f"https://cdn.jsdelivr.net/gh/fawazahmed0/hadith-api@1/editions/{ed.get('name')}.json"
                print(f"URL: {full_url}")
                
        else:
            print(f"Hata: {response.getcode()}")
except Exception as e:
    print(f"Hata oluştu: {e}")
