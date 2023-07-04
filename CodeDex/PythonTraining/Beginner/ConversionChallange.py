real_conversion = 1/4.81
colombian_peso_conversion = 1/4173.83
peruvian_soles_conversion = 1/3.62

left_in_real = float(input('How much you have left in reais?: '))
left_in_copeso = float(input('How much you have left in pesos?: '))
left_in_pesol = float(input('How much you have left in soles?: '))

total_in_usd = (left_in_real * real_conversion) + (left_in_copeso * colombian_peso_conversion) + (left_in_pesol * peruvian_soles_conversion)

print(total_in_usd)
