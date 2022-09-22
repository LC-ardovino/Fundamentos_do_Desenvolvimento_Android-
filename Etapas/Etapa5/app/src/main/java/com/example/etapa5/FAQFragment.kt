package com.example.etapa5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.etapa5.dados.duvidas

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FAQFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FAQFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout para este fragmento
        return inflater.inflate(R.layout.fragment_f_a_q, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Lista de TextViews que exibirão o texto das perguntas
        val perguntasTextViews = listOf(Pergunta1,
            p2_textview,
            p3_textview,
            p4_textview,
            p5_textview)
        // Lista de TextViews que exibirão o texto das respostas
        val respostasTextViews = listOf(r1_textview,
            r2_textview,
            r3_textview,
            r4_textview,
            r5_textview)
        // Configura cada texto iterativamente
        for (i in duvidas.indices){
            perguntasTextViews[i].text = duvidas[i].pergunta
            respostasTextViews[i].text = duvidas[i].resposta
        }
    }
}