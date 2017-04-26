package baidumap.rkf.com.mynexuesdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    MyAdapter mMyAdapter;
    List<UserModel> userModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mMyAdapter = new MyAdapter(this);
        recycler.setAdapter(mMyAdapter);
        initData();
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            UserModel model = new UserModel();
            model.setName("张三" + i);
            model.setSex("---" + i);
            userModelList.add(model);
        }
        mMyAdapter.addUsersList(userModelList);
        mMyAdapter.notifyDataSetChanged();
    }
}
