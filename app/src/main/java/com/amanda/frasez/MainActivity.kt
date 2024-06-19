package com.amanda.frasez

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amanda.frasez.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var frases = arrayListOf(
            "Não sonhe sua vida, viva seu sonho",
            "Se abra ao novo",
            "Quando você deseja o bem, o bem te deseja também",
            "É hora de inovar",
            "Se desafie",
            "Acredite em si mesmo",
            "Mudanças estão vindo",
            "Toda conquista começa com a decisão de tentar, então tente!",
            "Tudo depende da importancia que você dá...",
            "Não importa o que você decidiu. O que importa é que isso te faça feliz",
            "Tente outro biscoito!",
            "Coisas boas se vão para que melhores possam vir",
            "É pra frente que se anda, é pra cima que se olha e é lutando que se conquista",
            "A única coisa que cai do céu é chuva. O resto é luta!",
            "Seja persistente",
            "É melhor você tentar algo, vê-lo não funcionar e aprender com isso, do que não fazer nada",
            "Sucesso é o acúmulo de pequenos esforços, repetidos dia a dia",
            "Que tal outra tentativa?",
            "Pare de procrastinar",
            "Você consegue!",
            "Confie mais em você mesmo",
            "Nem todos os dias são bons, mas há algo bom em cada dia"
        )

        binding.btnAbraNovo.setOnClickListener {
            binding.textViewFrase.text = frases.random()

            }
        }
     }






