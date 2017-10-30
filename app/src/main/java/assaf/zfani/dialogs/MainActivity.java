package assaf.zfani.dialogs;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /////////////////////////////////////////////////////
        ///////////dialog with fragment/////////////////////
        /*
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment df = new BlankFragment();
                df.show(getFragmentManager(),"First");

            }
        });
        */
        ///////////////////////////////////////////////////////
        //////////////////////////////////////////////////////

        //////////////////////////////////////////////////////
        ////////////dialog with "builder"////////////////////
        /*
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage("you pressed the the button")
                        .setTitle("Button pressed")
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Log.i("Negative","Pressed");
                            }
                        })
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Log.i("Positive","Pressed");
                            }
                        })
                        .setNeutralButton("Back", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Log.i("Neutral","Pressed");
                            }
                        })
                        .show();
            }
        });
        */
        //////////////////////////////////////////////////////
        //////////////////////////////////////////////////////

        //////////////////////////////////////////////////////
        ////////////////progress Dialog///////////////////////
        ////////show progress of download for example/////////
        /*
        pd= new ProgressDialog(this);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd.setIndeterminate(false);
                pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                pd.setProgress(0);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0;i<10;i++) {
                            pd.incrementProgressBy(10);
                            if(pd.getProgress()==pd.getMax())
                            {
                                pd.dismiss();
                                pd.incrementProgressBy(-pd.getMax());
                            }
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();

                        pd.show();
            }
        });
        */
        //////////////////////////////////////////////////////
        //////////////////////////////////////////////////////


        //////////////////////////////////////////////////////
        //////////////Alert Dialog Choices////////////////////
        final CharSequence[] items ={"dog","cat","fish"};
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this)
                        /*
                        .setSingleChoiceItems(items, 1, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show();
                        */
                        .setMultiChoiceItems(items, new boolean[]{false, false, false}, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                if(which==1&& isChecked==true)
                                {
                                    Log.i("Chose cat","true");
                                }
                            }
                        }).show();


            }
        });

    }
}
