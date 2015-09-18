package com.webjyotishi.iching.activity;

/**
 * Created by Ravi on 29/07/15.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.webjyotishi.iching.R;
import com.webjyotishi.iching.animation.FlipAnimator;


public class HomeFragment extends Fragment {

    private ImageView iv_heads, iv_tails;
    private LinearLayout layout;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        //init all variables
        init(rootView);
        
        // Inflate the layout for this fragment
        return rootView;
    }

    private void init(View rootView) {
        iv_heads = (ImageView) rootView.findViewById(R.id.iv_heads);
        iv_tails = (ImageView) rootView.findViewById(R.id.iv_tails);
        layout = (LinearLayout) rootView.findViewById(R.id.layout);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FlipAnimator animator = new FlipAnimator(iv_heads, iv_tails,
                        iv_heads.getWidth() / 2, iv_tails.getHeight() / 2);
                if (iv_heads.getVisibility() == View.GONE) {
                    animator.reverse();
                }
                layout.startAnimation(animator);
            }
        });
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
