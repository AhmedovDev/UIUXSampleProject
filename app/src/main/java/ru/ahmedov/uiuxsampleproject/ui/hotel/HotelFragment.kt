package ru.ahmedov.uiuxsampleproject.ui.hotel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.fragment_hotel.*
import ru.ahmedov.uiuxsampleproject.R
import java.util.ArrayList

class HotelFragment : Fragment() {

    var accounts = ArrayList<Account>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_hotel, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setInitialData()
        initViews()
        showTeaching()

    }

    private fun initViews() {

        recyclerView.run {
            layoutManager = LinearLayoutManager(
                recyclerView.context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
            val snapHelper = PagerSnapHelper()
            snapHelper.attachToRecyclerView(recyclerView)
            addItemDecoration(
                CirclePagerIndicatorDecoration()
            )
        }
    }

    fun setInitialData() {

        accounts.add(
            Account(
                R.drawable.hotel,
                "",""

            )
        )
        accounts.add(
            Account(
                R.drawable.hotel1,
                "",""

            )
        )
        accounts.add(
            Account(
                R.drawable.hotel2,
                "",""
            )
        )
    }


    fun showTeaching() {
        val adapter = NumbersAdapter(context, accounts)
        recyclerView.adapter = adapter
    }
}