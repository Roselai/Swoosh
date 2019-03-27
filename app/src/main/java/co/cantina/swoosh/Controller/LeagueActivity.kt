package co.cantina.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import co.cantina.swoosh.Model.Player
import co.cantina.swoosh.R
import co.cantina.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*


class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    //saving instance for when device is rotated
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }

    }

    fun leagueNextClicked(view: View){
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT ).show()

        }
    }

    fun onMensClicked(view: View){
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        player.league = "Mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        player.league = "Womens"
    }

    fun onCoedClicked(view: View){
        womensLeagueButton.isChecked = false
        mensLeagueButton.isChecked = false

        player.league = "Co-Ed"

    }
}
