package android.example.com.addimagealert;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton PlaceCamDialog = (ImageButton) findViewById(R.id.imageButton);

        PlaceCamDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView =getLayoutInflater().inflate(R.layout.dialog_photo, null);
                final EditText mDescription = (EditText) mView.findViewById(R.id.description);
                   Button fromGallery= (Button )mView.findViewById(R.id.button1);
                   Button TakePhoto= (Button )mView.findViewById(R.id.button2);
                   Button ClearPhoto= (Button )mView.findViewById(R.id.button3);
                   Button mDone= (Button )mView.findViewById(R.id.button4);

                mDone.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "uploaded successfully", Toast.LENGTH_SHORT).show();
                    }

                });

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

            }
        });



        }
}
