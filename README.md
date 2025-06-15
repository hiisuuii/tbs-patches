**This mod contains NO code, assets, or otherwise from The Broken Script. This is an add-on mod for The Broken Script, designed to make creating videos or livestreams of the mod a better experience.
The Broken Script is required for this mod to work, and can be downloaded [here](https://modrinth.com/mod/the-broken-script/).**

This description contains what may be considered spoilers for the contents of The Broken Script. Proceed with caution, lest your horror experience be spoiled.

A set of miscellaneous patches for The Broken Script for 1.20.1 on Forge. All patches can be toggled on and off in the config file: `tbspatch-common.toml`, except where noted.
As of the latest version, the available patches are as follows:
### /tbs_config Default Value Changes
- Disable banning by default.
- Disable crashing by default.
- Disable the VHS filter by default.
- Disable the "base exploding event" by default.
- Disable any Broken Script entities from spawning by default.
- Disable any Broken Script events from happening by default.
- Disable any jumpscares from happening by default.
- Disable any Broken Script structures from spawning by default.
- Disable any Broken Script entities from breaking blocks by default.

These config patches do NOT affect the functionality of The Broken Script's in-game config menu. These changes only effect these options' initial values upon creating a world. After entering a world, you can still use the original mod's config menu as normal, and toggle the options as you wish. These changes only affect the default value of the options within the in-game config, to make the mod less destructive by default.
### Miscellanous Tweaks
- Re-enable the "Quit Game" button on the main menu
- Re-enable the use of in-game commands when cheats are enabled
- Option to use Broken Script's old corrupted moon textures
### Bugfixes
- The checked-ness of the checkboxes in the `/tbs_config` menu now match their actual values when the menu is opened. This patch cannot be toggled.
- The `/tbs_forcerandomevent` command now uses the same set of events as are triggered by the event engine. This patch cannot be toggled.
- The "moon corruption" event now renders correctly. Previously, sometimes the moon would render as a large pink square. This patch cannot be toggled.
- The "moon corruption" event now correctly loops. Previously, if the event successfully triggered while the moon was already on the second phase of corruption, the "moon corruption" would reset visually but the internal counter would continue increasing up to a value of 1.7*10^308. This patch cannot be toggled.
- Events that change the in-game time no longer reset the in-game day to Day 0. This patch cannot be toggled.
### Additional Options
- There are config options to enable or disable each of the 55 random events that can occur in The Broken Script.
