package com.example.myapplication.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.myapplication.R;
import com.google.firebase.database.FirebaseDatabase;

import static com.example.myapplication.R.menu.menu_activity_produto_admin;

public class ProdutoAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto_admin);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        findViewById(R.id.button).setOnClickListener(() -> {});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_produto_admin, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.menuitem_barcode_admin:
                Toast.makeText(this, "Clicou na opcao barcode", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuitem_limparform_admin:
                Toast.makeText(this, "Clicou no botao de limpar", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
