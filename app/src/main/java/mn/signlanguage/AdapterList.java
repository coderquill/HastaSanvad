package mn.signlanguage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rupali Kavale On 30 May 2020.
 */
public class AdapterList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] titleId;
    private final String[] subtitleId;
    private final Integer[] imageId;

    public AdapterList(Activity context, String[] titleId, String[] subtitleId, Integer[] imageId) {
        super(context, R.layout.about_item, titleId);
        this.context = context;
        this.titleId = titleId;
        this.subtitleId = subtitleId;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.about_item, null, true);

        TextView title = (TextView) rowView.findViewById(R.id.title);
        TextView subtitle = (TextView) rowView.findViewById(R.id.subtitle);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image);

        title.setText(titleId[position]);
        subtitle.setText(subtitleId[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}