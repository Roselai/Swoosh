package co.cantina.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import co.cantina.swoosh.Utilities.EXTRA_LEAGUE
import co.cantina.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onSkillFinishClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            startActivity(finishActivity)
        }
    }

    fun onBeginnerClick(view: View) {
        ballerSkillButton.isChecked = false
        skill = "beginner"
    }

    fun onBallerClick(view: View){
        beginnerSkillButton.isChecked = false
        skill = "baller"
    }
}
