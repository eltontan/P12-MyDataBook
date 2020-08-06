package sg.edu.rp.c347.id18016094.p12_mydatabook;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BioFragment extends Fragment {
    TextView tvBio;
    Button btnBio;
    public BioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_bio, container, false);
             tvBio = view.findViewById(R.id.textViewBio);
             btnBio = view.findViewById(R.id.btnFragBio);

            btnBio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder myBuilder = new AlertDialog.Builder(getContext());
                    //Set the Dialog Details
                    myBuilder.setTitle("Edit Bio");
                    final EditText inputDetails = new EditText(getActivity());
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    inputDetails.setLayoutParams(lp);
                    myBuilder.setView(inputDetails);

                    myBuilder.setCancelable(false);
                    myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            tvBio.setText(inputDetails.getText().toString());
                        }
                    });
                    myBuilder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                          dialog.cancel();
                        }
                    });
                    AlertDialog myDialog = myBuilder.create();
                    myDialog.show();
                }
            });
            return view;
        }
}