package mn.signlanguage;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class ActivityProject extends AppCompatActivity {

    WebView webView;
    ImageView imgViewEN;
    ImageView imgViewMN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("प्रकल्पाबद्दल");
        webView = (WebView)findViewById(R.id.pWebView);
        imgViewEN = (ImageView) findViewById(R.id.imgButtonEn);
        imgViewMN = (ImageView) findViewById(R.id.imgButtonMn);
        final String mn = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
        "<p>पुणे इन्स्टिट्युट ऑफ कंप्युटर टेक्नोलॉजी, पुणे येथील आय. टी. शाखेतील खालील विद्यार्थ्यांनी अंतिम वर्षान्तर्गत बनवलेला प्रकल्प</p>" +
                "\n" +
                "प्रकल्पाचे नाव : \"हस्तसंवाद\"</p>\n"+
                "<p>प्रकल्प गट सदस्य:</p>\n" +
                "<p style=\"margin-left: 20px\">" +
                "            १. रुपाली कावळे<br>\n" +
                "            २. गिरीजा क्षीरसागर<br>\n" +
                "            ३. श्रद्धा फलाने<br>\n" +
                "            ४. श्रेया भट्टड<br>\n" +
                "            </p>\n" +
                "<p>प्रकल्प मार्गदर्शक:</p>\n" +
                "<p style=\"margin-left:20px\">" +
                "            डॉ. धर्माधिकारी मॅडम <br>\n" +
                "\n" +
                "<p> प्रकल्प समालोचक :</p>\n" +
                "<p style=\"margin-left:20px\">" +
                "            १. प्रोफ. रचना छाज्जड <br>\n" +
                "            २. प्रोफ. एस.बी.देशमुख <br></p>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";

        final String en = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<p>A project by final year students of PICT, Pune, IT department,\n</p>\n" +
                "\n" +
                "<p>Project name: Hastasanvad - Devnagari sign language recognition</p>\n" +
                "<p>Team members:</p>\n" +
                "<p style=\"margin-left: 20px\">\n" +
                "            1. Rupali Kavale<br>\n" +
                "            2. Girija Kshirsagar<br>\n" +
                "            3. Shraddha Falane<br>\n" +
                "            4. Shreya Bhattad<br>\n" +
                "            </p>\n" +
                "<p>Project Guide:</p>\n" +
                "<p style=\"margin-left:20px\">\n" +
                "            Dr. S.C.Dharmadhikari <br></p>\n" +
                "\n" +
                "<p> Project Reviewer:</p>\n" +
                "<p style=\"margin-left:20px\">\n" +
                "            1.Prof. Rachana Chhajed <br>\n" +
                "            2.Prof. S.B.Deshmukh<br></p>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
        webView.loadData(mn, "text/html; charset=utf-8", "utf-8");

        imgViewEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadData(en,"text/html; charset=utf-8", "utf-8");
            }
        });


        imgViewMN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.loadData(mn,"text/html; charset=utf-8", "utf-8");
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
