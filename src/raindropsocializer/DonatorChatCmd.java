package raindropsocializer;

import java.util.Arrays;
import java.util.List;

import PluginReference.ChatColor;
import PluginReference.MC_Command;
import PluginReference.MC_Player;
import PluginReference.RainbowUtils;

public class DonatorChatCmd implements MC_Command {

	@Override
	public List<String> getAliases() {
		return Arrays.asList("dc");
	}

	@Override
	public String getCommandName() {
		return "donatorchat";
	}

	@Override
	public String getHelpLine(MC_Player arg0) {
		return ChatColor.LIGHT_PURPLE + "/donatorchat " + ChatColor.WHITE + "--- Chat in Donator Chat!";
	}

	@Override
	public List<String> getTabCompletionList(MC_Player arg0, String[] arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleCommand(MC_Player arg0, String[] arg1) {
        if(hasPermissionToUse(arg0)) {
            for(MC_Player player: RainbowUtils.getServer().getPlayers()) {
                if(player.hasPermission("raindrop.staffchat")) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "[Donator]: " + arg0.getName() + ChatColor.GRAY + " " + arg1);
            }
            } } else {
            arg0.sendMessage(ChatColor.RED + "You don't have permission!");
        }
    }

	@Override
	public boolean hasPermissionToUse(MC_Player plr) {
		return plr.hasPermission("raindrop.donatorchat");
	}

}
