import tkinter as tk
from tkinter import ttk
from Viagem import Viagem  # Importando a classe Viagem

def calcular_viagem():
    # Obtendo os valores dos campos de entrada
    distancia = float(entry_distancia.get())
    preco_gasolina = float(entry_preco.get())
    velocidade = float(entry_velocidade.get())
    tipo_carro = combo_tipo_carro.get()

    # Criando um objeto da classe Viagem
    viagem = Viagem(distancia, preco_gasolina, velocidade, tipo_carro)

    # Processando os dados e exibindo o resultado
    resultado = viagem.processar()
    viagem.mostrar(*resultado)

# Criando a janela principal
root = tk.Tk()
root.title("Calculadora de Viagem")

# Criando os labels e campos de entrada
label_distancia = tk.Label(root, text="Distância (km):")
entry_distancia = tk.Entry(root)

label_preco = tk.Label(root, text="Preço da gasolina (R$):")
entry_preco = tk.Entry(root)

label_velocidade = tk.Label(root, text="Velocidade média (km/h):")
entry_velocidade = tk.Entry(root)

label_tipo_carro = tk.Label(root, text="Tipo de carro:")
combo_tipo_carro = tk.ttk.Combobox(root, values=["a", "b", "c"])

# Criando o botão de calcular
button_calcular = tk.Button(root, text="Calcular", command=calcular_viagem)

# Colocando os elementos na janela
label_distancia.pack()
entry_distancia.pack()
label_preco.pack()
entry_preco.pack()
label_velocidade.pack()
entry_velocidade.pack()
label_tipo_carro.pack()
combo_tipo_carro.pack()
button_calcular.pack()

root.mainloop()