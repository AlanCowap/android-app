package ie.yesequality.yesequality;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dean on 28/03/2015.
 */

public class InformationPagesFragment extends Fragment {

    public static final InformationPagesFragment newInstance(int pictureID, int aboveTextID, int belowTextID, int colorID) {

        InformationPagesFragment fragment = new InformationPagesFragment();

        Bundle bundle = new Bundle(4);
        bundle.putInt("PICTURE_ID", pictureID);
        bundle.putInt("BELOW_TEXT", belowTextID);
        bundle.putInt("ABOVE_TEXT", aboveTextID);
        bundle.putInt("COLOR_ID", colorID);

        fragment.setArguments(bundle);


        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_information_pages_layout, container, false);

        TextView aboveTextView = (TextView) rootView.findViewById(R.id.information_above_text);
        TextView belowTextView = (TextView) rootView.findViewById(R.id.information_below_text);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.information_image);

        String aboveText = getResources().getString(getArguments().getInt("ABOVE_TEXT"));
        String belowText = getResources().getString(getArguments().getInt("BELOW_TEXT"));
        int imageID = getArguments().getInt("PICTURE_ID");
        rootView.setBackgroundColor(getResources().getColor(getArguments().getInt("COLOR_ID")));

        aboveTextView.setText(aboveText);
        belowTextView.setText(belowText);
        imageView.setImageResource(imageID);


        return rootView;
    }
}
