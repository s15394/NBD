import riak

client = riak.RiakClient()

bucket = client.bucket('s15394')
filemon_data = {'name': 'Filemon Ferby', 'nationality': 'Ireland', 'weight': 75, 'height': 169}
# wrzutka do bazy
person = bucket.new('Filemon', data=filemon_data)
person.store()
# pobranie
person = bucket.get('Filemon')
# wypisanie
print("Dane nowo dodanej osoby: " + str(person.data))

print("Zamiana wartość pola nationality na Welsh")
# modyfikacja
person.data['nationality'] = 'Welsh'

person.store()
# pobranie
person = bucket.get('Filemon')
# wypisanie
print("Dane osoby po updatecie: " + str(person.data))
# usunięcie
person.delete()
# próba pobrania
person = bucket.get('Filemon')
# wypisanie
print("Wynik geta na usuniętym obiekcie: " + str(person.data))

