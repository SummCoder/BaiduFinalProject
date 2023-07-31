package com.example.finalproject.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.addnews.AddNewsActivity
import com.example.finalproject.search.SearchActivity
import com.example.finalproject.weather.WeatherActivity

class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView = view.findViewById(R.id.news)
        adapter = NewsAdapter(context, createDemoDate())

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter

        // 跳转到天气activity
        view.findViewById<TextView>(R.id.weather).setOnClickListener {
            startActivity(Intent(activity, WeatherActivity::class.java))
        }
        // 跳转到添加新闻的activity
        view.findViewById<ImageView>(R.id.extra).setOnClickListener {
            startActivity(Intent(activity, AddNewsActivity::class.java))
        }
        //跳转到搜索页框
        view.findViewById<EditText>(R.id.searchEditText).setOnClickListener {
            startActivity(Intent(activity, SearchActivity::class.java))
        }

//        view.findViewById<AppBarLayout>(R.id.appBarLayout).addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
//            val totalScrollRange = appBarLayout.totalScrollRange
//            val searchLayout = view.findViewById<LinearLayout>(R.id.search_bar)
//            // 根据滚动距离来控制搜索框的位置
//            if (kotlin.math.abs(verticalOffset) >= totalScrollRange) {
//                // 搜索框吸顶态，将搜索框从原位置移动到AppBarLayout的顶部
//                val params = searchLayout.layoutParams as CoordinatorLayout.LayoutParams
//                params.topMargin = 0
//                searchLayout.layoutParams = params
//            } else {
//                // 搜索框非吸顶态，将搜索框恢复到原位置
//                val params = searchLayout.layoutParams as CoordinatorLayout.LayoutParams
//                params.topMargin = resources.getDimensionPixelSize(R.dimen.search_margin_top)
//                searchLayout.layoutParams = params
//            }
//        })



        return view
    }

    private fun createDemoDate(): ArrayList<ItemBean> {
        // 为首页的新闻recycleView加点内容
        val list = ArrayList<ItemBean>()

        val zeroItem = ItemBean(0, "时政微观查 | 相逢盛会， 相聚想知", " 置顶", "央视新闻")
        val firstItem = ItemBean(0, "习言道 | 让体育为社会提供强大正能量", " 置顶", "中国新闻网")
        val secondItem = ItemBean(R.drawable.news2, "国际奥委会敦促“敏感地”处理涉俄乌运动员比赛，俄奥委会主席发声", "", "环球网")
        val thirdItem = ItemBean(R.drawable.news3, "外媒：拜登经提醒才意识到忘记签行政令，匆忙回到演讲台", "", "环球网")
        val fourthItem = ItemBean(R.drawable.news4, "中国队选手曹茂园摘得成都大运会首金", "", "环球时报")

        list.add(zeroItem)
        list.add(firstItem)

        for (i in 0 until 8) {
            list.add(secondItem)
            list.add(thirdItem)
            list.add(fourthItem)
        }

        return list
    }


}