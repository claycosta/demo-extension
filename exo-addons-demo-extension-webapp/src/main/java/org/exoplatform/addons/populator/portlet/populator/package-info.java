@Assets(
        location = AssetLocation.SERVER,
        scripts = {
                @Script(src = "js/demo-extension.js", id = "jquery")
        },
        stylesheets = {
                @Stylesheet(src = "/org/exoplatform/addons/populator/portlet/populator/assets/populator.css", location = AssetLocation.APPLICATION, id = "populator")
        }

)
@Bindings(
        {
                @Binding(value = org.exoplatform.services.organization.OrganizationService.class),
                @Binding(value = org.exoplatform.social.core.space.spi.SpaceService.class),
                @Binding(value = org.exoplatform.social.core.manager.IdentityManager.class),
                @Binding(value = org.exoplatform.social.core.manager.ActivityManager.class),
                @Binding(value = org.exoplatform.social.core.manager.RelationshipManager.class),
                @Binding(value = org.exoplatform.calendar.service.CalendarService.class),
                @Binding(value = org.exoplatform.wiki.service.WikiService.class),
                @Binding(value = org.exoplatform.services.jcr.RepositoryService.class),
                @Binding(value = org.exoplatform.services.jcr.ext.app.SessionProviderService.class),
                @Binding(value = org.exoplatform.services.jcr.ext.hierarchy.NodeHierarchyCreator.class),
                @Binding(value = org.exoplatform.forum.service.ForumService.class),
                @Binding(value = org.exoplatform.poll.service.PollService.class),
                @Binding(value = org.exoplatform.forum.common.jcr.KSDataLocation.class)
        }
)

@Less(value = {"populator.less"}, minify = true)

@Application(defaultController = PopulatorApplication.class)
@Portlet(name="PopulatorPortlet") package org.exoplatform.addons.populator.portlet.populator;

import juzu.Application;
import juzu.asset.AssetLocation;
import juzu.plugin.asset.Assets;
import juzu.plugin.asset.Script;
import juzu.plugin.asset.Stylesheet;
import juzu.plugin.binding.Binding;
import juzu.plugin.binding.Bindings;
import juzu.plugin.less.Less;
import juzu.plugin.portlet.Portlet;

