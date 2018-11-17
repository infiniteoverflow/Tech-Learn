package com.techlearn.aswin.techlearn;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;

public class phoneSetUpActivity extends AppCompatActivity {

    Switch swc1,swc2,swc3,swc4;
    int currentVolumeRing,currentVolumeNotification,currentVolumeAlarm,currentVolumeMusic,currentVolumeSystem;

    boolean swc1Enabled = true;
    boolean swc2Enabled = true;
    boolean swc3Enabled = true;
    boolean swc4Enabled = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phoneset);

        swc1 = findViewById(R.id.meetingSwitch);
        swc2 = findViewById(R.id.playingModeSwitch);
        swc3 = findViewById(R.id.studyingSwitch);
        swc4 = findViewById(R.id.vibrationSwitch);


        swc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(swc1Enabled)
                {
                    AudioManager audio = (AudioManager) getSystemService(AUDIO_SERVICE);
                    currentVolumeMusic = audio.getStreamVolume(AudioManager.STREAM_MUSIC);
                    currentVolumeAlarm = audio.getStreamMaxVolume(AudioManager.STREAM_ALARM);
                    currentVolumeNotification = audio.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION);
                    currentVolumeRing = audio.getStreamMaxVolume(AudioManager.STREAM_RING);
                    currentVolumeSystem = audio.getStreamMaxVolume(AudioManager.STREAM_SYSTEM);

                    swc2.setEnabled(false);
                    swc3.setEnabled(false);
                    swc4.setEnabled(false);
                    swc1Enabled = false;

                    audio.setStreamVolume(AudioManager.STREAM_RING,-10,0);
                    audio.setStreamVolume(AudioManager.STREAM_ALARM,0,0);
                    audio.setStreamVolume(AudioManager.STREAM_MUSIC,0,0);
                }
                else
                {
                    swc2.setEnabled(true);
                    swc3.setEnabled(true);
                    swc4.setEnabled(true);
                    swc1Enabled = true;

                    AudioManager audio = (AudioManager) getSystemService(AUDIO_SERVICE);
                    audio.setStreamVolume(AudioManager.STREAM_SYSTEM,currentVolumeRing,0);
                    audio.setStreamVolume(AudioManager.STREAM_ALARM,currentVolumeAlarm,0);
                    audio.setStreamVolume(AudioManager.STREAM_MUSIC,currentVolumeMusic,0);
                }
            }
        });


        swc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(swc2Enabled)
                {
                    swc1.setEnabled(false);
                    swc3.setEnabled(false);
                    swc4.setEnabled(false);
                    swc2Enabled = false;

                    AudioManager audio = (AudioManager) getSystemService(AUDIO_SERVICE);
                    currentVolumeMusic = audio.getStreamVolume(AudioManager.STREAM_MUSIC);
                    currentVolumeAlarm = audio.getStreamMaxVolume(AudioManager.STREAM_ALARM);
                    currentVolumeNotification = audio.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION);
                    currentVolumeRing = audio.getStreamMaxVolume(AudioManager.STREAM_RING);
                    currentVolumeSystem = audio.getStreamMaxVolume(AudioManager.STREAM_SYSTEM);

                    audio.setStreamVolume(AudioManager.STREAM_RING,-10,0);
                    audio.setStreamVolume(AudioManager.STREAM_ALARM,0,0);
                    audio.setStreamVolume(AudioManager.STREAM_MUSIC,0,0);
                }
                else
                {
                    swc1.setEnabled(true);
                    swc3.setEnabled(true);
                    swc4.setEnabled(true);
                    swc2Enabled = true;

                    AudioManager audio = (AudioManager) getSystemService(AUDIO_SERVICE);
                    audio.setStreamVolume(AudioManager.STREAM_SYSTEM,currentVolumeRing,0);
                    audio.setStreamVolume(AudioManager.STREAM_ALARM,currentVolumeAlarm,0);
                    audio.setStreamVolume(AudioManager.STREAM_MUSIC,currentVolumeMusic,0);
                }
            }
        });


        swc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(swc3Enabled)
                {
                    swc1.setEnabled(false);
                    swc2.setEnabled(false);
                    swc4.setEnabled(false);
                    swc3Enabled = false;

                    AudioManager audio = (AudioManager) getSystemService(AUDIO_SERVICE);
                    currentVolumeMusic = audio.getStreamVolume(AudioManager.STREAM_MUSIC);
                    currentVolumeAlarm = audio.getStreamMaxVolume(AudioManager.STREAM_ALARM);
                    currentVolumeNotification = audio.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION);
                    currentVolumeRing = audio.getStreamMaxVolume(AudioManager.STREAM_RING);
                    currentVolumeSystem = audio.getStreamMaxVolume(AudioManager.STREAM_SYSTEM);

                    audio.setStreamVolume(AudioManager.STREAM_RING,-10,0);
                    audio.setStreamVolume(AudioManager.STREAM_ALARM,0,0);
                    audio.setStreamVolume(AudioManager.STREAM_MUSIC,0,0);
                }
                else
                {
                    swc1.setEnabled(true);
                    swc2.setEnabled(true);
                    swc4.setEnabled(true);
                    swc3Enabled = true;

                    AudioManager audio = (AudioManager) getSystemService(AUDIO_SERVICE);
                    audio.setStreamVolume(AudioManager.STREAM_SYSTEM,currentVolumeRing,0);
                    audio.setStreamVolume(AudioManager.STREAM_ALARM,currentVolumeAlarm,0);
                    audio.setStreamVolume(AudioManager.STREAM_MUSIC,currentVolumeMusic,0);
                }
            }
        });

        swc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(swc4Enabled)
                {
                    swc1.setEnabled(false);
                    swc2.setEnabled(false);
                    swc3.setEnabled(false);
                    swc4Enabled = false;

                    AudioManager audio = (AudioManager) getSystemService(AUDIO_SERVICE);
                    currentVolumeMusic = audio.getStreamVolume(AudioManager.STREAM_MUSIC);
                    currentVolumeAlarm = audio.getStreamMaxVolume(AudioManager.STREAM_ALARM);
                    currentVolumeNotification = audio.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION);
                    currentVolumeRing = audio.getStreamMaxVolume(AudioManager.STREAM_RING);
                    currentVolumeSystem = audio.getStreamMaxVolume(AudioManager.STREAM_SYSTEM);

                    audio.setStreamVolume(AudioManager.STREAM_RING,0,0);
                    audio.setStreamVolume(AudioManager.STREAM_ALARM,0,0);
                    audio.setStreamVolume(AudioManager.STREAM_MUSIC,0,0);
                }
                else
                {
                    swc1.setEnabled(true);
                    swc2.setEnabled(true);
                    swc3.setEnabled(true);
                    swc4Enabled = true;

                    AudioManager audio = (AudioManager) getSystemService(AUDIO_SERVICE);
                    audio.setStreamVolume(AudioManager.STREAM_SYSTEM,currentVolumeRing,0);
                    audio.setStreamVolume(AudioManager.STREAM_ALARM,currentVolumeAlarm,0);
                    audio.setStreamVolume(AudioManager.STREAM_MUSIC,currentVolumeMusic,0);
                }
            }
        });


    }

    public void setSilentMode()
    {


    }
}
