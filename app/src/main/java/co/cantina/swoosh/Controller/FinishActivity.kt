package co.cantina.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.cantina.swoosh.R
import co.cantina.swoosh.Utilities.EXTRA_LEAGUE
import co.cantina.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class FinishActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)
        searchLeaguesText.text = "Looking for a $league $skill league near you"
    }
}
