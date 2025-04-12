// JavaScript for Graf Teorisi Website

document.addEventListener('DOMContentLoaded', function() {
    // Back to top button functionality
    const backToTopButton = document.createElement('a');
    backToTopButton.href = '#';
    backToTopButton.className = 'back-to-top';
    backToTopButton.innerHTML = '&uarr;';
    document.body.appendChild(backToTopButton);

    // Show/hide back to top button based on scroll position
    window.addEventListener('scroll', function() {
        if (window.pageYOffset > 300) {
            backToTopButton.classList.add('visible');
        } else {
            backToTopButton.classList.remove('visible');
        }
    });

    // Smooth scroll to top when back to top button is clicked
    backToTopButton.addEventListener('click', function(e) {
        e.preventDefault();
        window.scrollTo({
            top: 0,
            behavior: 'smooth'
        });
    });

    // Add smooth scrolling to all links
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function(e) {
            e.preventDefault();
            
            const targetId = this.getAttribute('href');
            if (targetId === '#') return;
            
            const targetElement = document.querySelector(targetId);
            if (targetElement) {
                targetElement.scrollIntoView({
                    behavior: 'smooth'
                });
            }
        });
    });

    // Add table of contents navigation
    const content = document.getElementById('content');
    if (content) {
        // Find all headings in the content
        const headings = content.querySelectorAll('h2, h3');
        if (headings.length > 0) {
            // Create table of contents container
            const tocContainer = document.createElement('div');
            tocContainer.className = 'toc-container';
            tocContainer.innerHTML = '<h3>İçindekiler</h3>';
            
            // Create list for table of contents
            const tocList = document.createElement('ul');
            tocContainer.appendChild(tocList);
            
            // Add each heading to the table of contents
            headings.forEach((heading, index) => {
                // Create unique ID for the heading if it doesn't have one
                if (!heading.id) {
                    heading.id = 'heading-' + index;
                }
                
                // Create list item for the heading
                const listItem = document.createElement('li');
                listItem.className = heading.tagName.toLowerCase();
                
                // Create link to the heading
                const link = document.createElement('a');
                link.href = '#' + heading.id;
                link.textContent = heading.textContent;
                
                // Add link to list item
                listItem.appendChild(link);
                
                // Add list item to table of contents
                tocList.appendChild(listItem);
            });
            
            // Insert table of contents at the beginning of the content
            content.insertBefore(tocContainer, content.firstChild);
        }
    }

    // Add syntax highlighting to code blocks
    document.querySelectorAll('pre code').forEach((block) => {
        hljs.highlightBlock(block);
    });

    // Add responsive navigation menu for mobile
    const mainNav = document.getElementById('main-nav');
    if (mainNav) {
        const menuButton = document.createElement('button');
        menuButton.className = 'menu-toggle';
        menuButton.innerHTML = '&#9776;';
        menuButton.setAttribute('aria-label', 'Toggle navigation menu');
        
        // Insert menu button before the navigation
        mainNav.parentNode.insertBefore(menuButton, mainNav);
        
        // Toggle navigation menu when menu button is clicked
        menuButton.addEventListener('click', function() {
            mainNav.classList.toggle('active');
        });
    }

    // Add active class to current navigation item
    const currentLocation = window.location.href;
    const navLinks = document.querySelectorAll('#main-nav a');
    
    navLinks.forEach(link => {
        if (link.href === currentLocation) {
            link.classList.add('active');
        }
    });
});
