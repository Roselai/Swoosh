package co.cantina.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*


class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun leagueNextClicked(view: View){
        if (selectedLeague != "") {
            val leagueIntent = Intent(this, SkillActivity::class.java)
            startActivity(leagueIntent)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT ).show()

        }
    }

    fun onMensClicked(view: View){
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        selectedLeague = "Mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        selectedLeague = "Womens"
    }

    fun onCoedClicked(view: View){
        womensLeagueButton.isChecked = false
        mensLeagueButton.isChecked = false

        selectedLeague = "Co-Ed"

    }
}
