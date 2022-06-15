package com.mayabispo.todolist.fragment

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import java.time.LocalDate
import java.time.ZoneId
import java.util.*

class DatePickerFragment (
    val timerPickerListener : TimerPickerListener
    ) : DialogFragment(), DatePickerDialog.OnDateSetListener {

    // retornar o calendário com a data atual
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendario = Calendar.getInstance()
        val ano = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)
        val dia = calendario.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(requireContext(), this, ano, mes, dia)
    }

    // mudar a data do calendário e retornar qual o usuario selecionou
    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
       val cal = Calendar.getInstance()
        cal.set(Calendar.YEAR, year)
        cal.set(Calendar.MONTH, month)
        cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)

        timerPickerListener.onDateSelected(cal.time.toInstant().atZone(
            ZoneId.systemDefault()).toLocalDate()
        )
    }
}


interface TimerPickerListener{
    fun onDateSelected(data: LocalDate)
}