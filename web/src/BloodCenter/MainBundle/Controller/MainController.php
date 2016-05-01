<?php

namespace BloodCenter\MainBundle\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\Controller;

class MainController extends Controller
{
    public function indexAction()
    {
        return $this->render('BloodCenterMainBundle:Main:index.html.twig');
    }

    public function newDonorAction()
    {
        return $this->render('BloodCenterMainBundle:Main:new_donor.html.twig');


    }
}



