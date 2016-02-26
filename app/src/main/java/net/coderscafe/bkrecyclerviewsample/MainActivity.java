package net.coderscafe.bkrecyclerviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.messages) RecyclerView mMessageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mMessageList.setLayoutManager(layoutManager);

        MessageAdapter adapter = new MessageAdapter(getMessages());
        mMessageList.setAdapter(adapter);
    }

    private List<String> getMessages() {
        List<String> messages = new ArrayList<>();
        messages.add("First message");
        messages.add("Second message");
        messages.add("Third message");
        messages.add("Fourth message");
        return messages;
    }
}
