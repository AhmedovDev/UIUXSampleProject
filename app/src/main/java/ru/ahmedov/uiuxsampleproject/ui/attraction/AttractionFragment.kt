package ru.ahmedov.uiuxsampleproject.ui.attraction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_attraction.*
import ru.ahmedov.uiuxsampleproject.R
import ru.ahmedov.uiuxsampleproject.ui.hotel.Account
import java.util.ArrayList

class AttractionFragment : Fragment() {

    var accounts = ArrayList<Account>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_attraction, container, false)
        return root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setInitialData()
        initViews()
        showTeaching()

    }

    private fun initViews() {

        recycler_attraction.run {
            layoutManager = LinearLayoutManager(
                recycler_attraction.context,
                LinearLayoutManager.VERTICAL,
                false
            )

        }
    }

    fun setInitialData() {

        accounts.add(
            Account(
                R.drawable.park,
                "Набережная",
                "Дахадаева 33"

            )
        )
        accounts.add(
            Account(
                R.drawable.chindir,
                "Чиндир чиро",
                "с. Чиндир"

            )
        )
        accounts.add(
            Account(
                R.drawable.drago,
                "Парк 3Дракона",
                "Редукторный 12а"
            )
        )
        accounts.add(
            Account(
                R.drawable.park,
                "Парк 3Дракона",
                "Редукторный 12а"

            )
        )
        accounts.add(
            Account(
                R.drawable.original,
                "Сулакский каньён",
                "с.Дубки"

            )
        )
        accounts.add(
            Account(
                R.drawable.gamsutl,
                "Село призрак",
                "с.Гамсутль"
            )
        )
    }


    fun showTeaching() {
        val adapter = AdapterCustom(context, accounts)
        recycler_attraction.adapter = adapter
    }
}