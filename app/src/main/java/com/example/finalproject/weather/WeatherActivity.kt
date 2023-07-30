package com.example.finalproject.weather

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.databinding.WeatherItemBinding
import com.example.finalproject.home.WeatherAdapter

class WeatherActivity : AppCompatActivity() {
    private var rootView: FrameLayout? = null

    /** RecycleView 实例 */
    private var recycleView: RecyclerView? = null

    /** RecycleView 的适配器 */
    private var adapter: WeatherAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
//        rootView = findViewById(R.id.weather_root)
        // 添加RecycleView
        addRecycleView()

        val backImageView = findViewById<ImageView>(R.id.back)
        backImageView.setOnClickListener {
            onBackPressed()
        }
    }

    /**
     * 添加RecycleView
     */
    private fun addRecycleView() {
        // 从布局中进行获取
        recycleView = findViewById(R.id.weather0)
        adapter = WeatherAdapter(createDemoDate())
        recycleView?.adapter = adapter
        recycleView?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun createDemoDate(): ArrayList<WeatherBean> {

        val list = ArrayList<WeatherBean>()

        val item0 = WeatherBean("现在", R.drawable.ic_clear_day)
        val item1 = WeatherBean("11时", R.drawable.ic_clear_day)
        val item2 = WeatherBean("12时", R.drawable.ic_partly_cloud_day)
        val item3 = WeatherBean("13时", R.drawable.ic_clear_day)
        val item4 = WeatherBean("14时", R.drawable.ic_partly_cloud_day)
        val item5 = WeatherBean("15时", R.drawable.ic_partly_cloud_day)
        val item6 = WeatherBean("16时", R.drawable.ic_clear_day)
        val item7 = WeatherBean("17时", R.drawable.ic_clear_day)
        val item8 = WeatherBean("18时", R.drawable.ic_clear_day)
        val item9 = WeatherBean("19时", R.drawable.ic_clear_day)
        val item10 = WeatherBean("20时", R.drawable.ic_partly_cloud_day)
        val item11 = WeatherBean("21时", R.drawable.ic_clear_day)
        val item12 = WeatherBean("22时", R.drawable.ic_partly_cloud_day)
        val item13 = WeatherBean("23时", R.drawable.ic_clear_day)
        val item14 = WeatherBean("0时", R.drawable.ic_clear_day)
        val item15 = WeatherBean("1时", R.drawable.ic_clear_day)
        val item16 = WeatherBean("2时", R.drawable.ic_partly_cloud_day)
        val item17 = WeatherBean("3时", R.drawable.ic_clear_day)
        val item18 = WeatherBean("4时", R.drawable.ic_clear_day)
        val item19 = WeatherBean("5时", R.drawable.ic_partly_cloud_day)
        val item20 = WeatherBean("6时", R.drawable.ic_clear_day)
        val item21 = WeatherBean("7时", R.drawable.ic_partly_cloud_day)
        val item22 = WeatherBean("8时", R.drawable.ic_clear_day)
        val item23 = WeatherBean("9时", R.drawable.ic_partly_cloud_day)

        list.add(item0)
        list.add(item1)
        list.add(item2)
        list.add(item3)
        list.add(item4)
        list.add(item5)
        list.add(item6)
        list.add(item7)
        list.add(item8)
        list.add(item9)
        list.add(item10)
        list.add(item11)
        list.add(item12)
        list.add(item13)
        list.add(item14)
        list.add(item15)
        list.add(item16)
        list.add(item17)
        list.add(item18)
        list.add(item19)
        list.add(item20)
        list.add(item21)
        list.add(item22)
        list.add(item23)

        return list
    }
}