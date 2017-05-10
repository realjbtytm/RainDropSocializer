package raindropsocializer;

import java.util.Arrays;
import java.util.List;

import PluginReference.ChatColor;
import PluginReference.MC_Command;
import PluginReference.MC_Player;
import PluginReference.RainbowUtils;

public class StaffChatCmd implements MC_Command {

	@Override
	public List<String> getAliases() {
		return Arrays.asList("sc");
	}

	@Override
	public String getCommandName() {
		return "staffchat";
	}

	@Override
	public String getHelpLine(MC_Player arg0) {
		return ChatColor.LIGHT_PURPLE + "/staffchat " + ChatColor.WHITE + "--- Chat in Staff Chat!";
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
                	Object staffchat = ChatColor.LIGHT_PURPLE + "[Staff]: " + arg0.getName() + ChatColor.GRAY + " " + arg1;
                	String s = staffchat.toString();
                    player.sendMessage(s);
            }
            } } else {
            arg0.sendMessage(ChatColor.RED + "You don't have permission!");
        }
    }

	@Override
	public boolean hasPermissionToUse(MC_Player plr) {
		return plr.hasPermission("raindrop.staffchat");
	}

}
