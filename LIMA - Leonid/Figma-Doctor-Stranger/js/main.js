const menu = document.querySelector('.menu-burger-container')

function menuAction () {
    menu.classList.toggle ('show')
}

menu.addEventListener('click', menuAction)