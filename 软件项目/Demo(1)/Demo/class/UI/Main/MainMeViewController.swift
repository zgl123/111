//
//  Main_ViewController.swift
//  webDemo
//
//  Created by mac on 15/12/2.
//  Copyright © 2015年 jason. All rights reserved.
//


import UIKit

class MainMeViewController: UIViewController,UINavigationControllerDelegate {
    
    var cityRightBtn: TextImageButton!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        NSNotificationCenter.defaultCenter().addObserver(self, selector: "cityChange:", name: SD_CurrentCityChange_Notification, object: nil)
        
        cityRightBtn = TextImageButton(frame: CGRectMake(0, 20, 80, 44))
        let user = NSUserDefaults.standardUserDefaults()
        if let currentCity = user.objectForKey(SD_Current_SelectedCity) as? String {
            cityRightBtn.setTitle(currentCity, forState: .Normal)
        } else {
            cityRightBtn.setTitle("北京", forState: .Normal)
        }
        
        cityRightBtn.titleLabel?.font = theme.SDNavItemFont
        cityRightBtn.setTitleColor(UIColor.blackColor(), forState: UIControlState.Normal)
        cityRightBtn.setImage(UIImage(named: "home_down"), forState: .Normal)
        cityRightBtn.addTarget(self, action: "pushcityView", forControlEvents: .TouchUpInside)
        navigationItem.leftBarButtonItem = UIBarButtonItem(customView: cityRightBtn)
        
    }
    
    func pushcityView () {
        let cityVC = CityViewController()
        cityVC.cityName = self.cityRightBtn.titleForState(.Normal)
        let nav = MainNavigationController(rootViewController: cityVC)
        presentViewController(nav, animated: true, completion: nil)
    }
    
    func cityChange(noti: NSNotification) {
        if let currentCityName = noti.object as? String {
            self.cityRightBtn.setTitle(currentCityName, forState: .Normal)
        }
    }
    
    deinit {
        NSNotificationCenter.defaultCenter().removeObserver(self)
    }
}

// MARK: 自定义button,文字在左边 图片在右边
class TextImageButton: UIButton {
    
    override init(frame: CGRect) {
        super.init(frame: frame)
        titleLabel?.font = theme.SDNavItemFont
        titleLabel?.contentMode = UIViewContentMode.Center
        imageView?.contentMode = UIViewContentMode.Left
        
    }
    
    required init?(coder aDecoder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }
    
    override func layoutSubviews() {
        super.layoutSubviews()
        titleLabel?.sizeToFit()
        titleLabel?.frame = CGRectMake(-5, 0, titleLabel!.width, height)
        imageView?.frame = CGRectMake(titleLabel!.width + 3 - 5, 0, width - titleLabel!.width - 3, height)
    }
}