import random
gracze = int(input("Podaj liczbe graczy: "))
zaklad = int(input("Podaj stala stawke: "))
taktyka = float(input("Podaj sredni rzut kantowana koscia: "))
balans = int(input("Podaj balans konta (calkowity): "))
ile_sym = int(input("Podaj ilosc symulacji: "))
balansafe = balans
def Runda(gracze, zaklad, taktyka):
    global balans
    maks = 0
    for i in range(1,gracze+1):
        a = random.randint(1,6)
        b = random.randint(1,6)
        if a+b>maks:
            maks = a+b
    los = round(taktyka-taktyka//1,2)*100
    if random.randint(1,100) <= los and los != 0:
        taktyka = taktyka//1 + 1 
    else:
        taktyka = taktyka//1
    wynik = random.randint(1,6) + taktyka
    if wynik > maks:
        balans = balans + gracze * zaklad
        return 2
    if wynik == maks:
        balans = balans + ((gracze - 1) * zaklad)/2
        return 1
    else:
        balans = balans - zaklad
        return 0
def Jedna_Symulacja(gracze, zaklad,taktyka):
  global balans
  balans = balansafe
  loses = 0
  draws = 0
  wins = 0
  for i in range(1,101):
      if balans >= zaklad:
          a = Runda(gracze,zaklad,taktyka)
          if a == 2:
              wins = wins + 1
          elif a == 0:
              loses = loses + 1
          elif a == 1:
              draws = draws + 1
      else:
          return [1, (balans - balansafe)/100]
  return [0, (balans - balansafe)/100]


risk = 0
ev = 0
for i in range(0,ile_sym):
  wynik = Jedna_Symulacja(gracze, zaklad, taktyka)
  risk = risk + wynik[0]
  ev = ev + wynik[1]
print(balans)
print("Estimated Value per round = ", ev/ile_sym)
print("Risk of Ruin = ", round(risk/ile_sym*100,2), "%")
